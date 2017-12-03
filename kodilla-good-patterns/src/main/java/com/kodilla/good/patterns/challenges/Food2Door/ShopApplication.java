package com.kodilla.good.patterns.challenges.Food2Door;

public class ShopApplication {
    public static void main(String[] args){

        ShopOrderRequestRetriever retriever = new ShopOrderRequestRetriever();
        ShopOrderRequest request = retriever.retrieve();

        ShopOrderProcessor processor = new ShopOrderProcessor(new MailService(), new OnlineOrderService(),
                new OnlineOrderRepository());
        processor.process(request);
    }
}
