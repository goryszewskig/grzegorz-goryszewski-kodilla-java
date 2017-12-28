package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item> itemList = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "INVOICE_NUM")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Item> getItemList() {
        return itemList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
