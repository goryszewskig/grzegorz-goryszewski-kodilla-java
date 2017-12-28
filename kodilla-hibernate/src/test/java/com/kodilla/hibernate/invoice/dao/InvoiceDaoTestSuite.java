package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product beer = new Product("Vodka");
        Product crisps = new Product("Cheese");
        Item item1 = new Item(beer, new BigDecimal(14.00), 1);
        Item item2 = new Item(crisps, new BigDecimal(13.50), 2);

        Invoice invoice = new Invoice("123456");

        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //get items values
        BigDecimal price1 = invoice.getItemList().get(0).getPrice().stripTrailingZeros();
        int quant1 = invoice.getItemList().get(0).getQuantity();
        BigDecimal value1 = invoice.getItemList().get(0).getValue().stripTrailingZeros();

        BigDecimal price2 = invoice.getItemList().get(1).getPrice().stripTrailingZeros();
        int quant2 = invoice.getItemList().get(1).getQuantity();
        BigDecimal value2 = invoice.getItemList().get(1).getValue().stripTrailingZeros();

        //Then
        Assert.assertEquals(new BigDecimal(14.00), price1);
        Assert.assertEquals(1, quant1);
        Assert.assertEquals(new BigDecimal(14.00), value1);

        Assert.assertEquals(new BigDecimal(13.50), price2);
        Assert.assertEquals(2, quant2);
        Assert.assertEquals(new BigDecimal(27), value2);


        //Cleanup
        try {
            productDao.delete(invoice.getItemList().get(0).getId());
            productDao.delete(invoice.getItemList().get(1).getId());
            itemDao.delete(invoice.getItemList().get(0).getId());
            itemDao.delete(invoice.getItemList().get(1).getId());
            if (invoiceDao.count() != 0 || itemDao.count() != 0 || productDao.count() != 0) {
                itemDao.deleteAll();
                invoiceDao.deleteAll();
                productDao.deleteAll();
            }

        } catch (Exception e) {
            System.out.println("entities not found");
        }
    }
}
