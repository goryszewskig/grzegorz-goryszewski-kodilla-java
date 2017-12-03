package com.kodilla.good.patterns.challenges.Food2Door;

public class ShopOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ShopOrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean process(final ShopOrderRequest shopOrderRequest){

        boolean isOrdered = orderService.placeOrder(shopOrderRequest);

        if(isOrdered){
            informationService.inform(shopOrderRequest);
            orderRepository.createOrder(shopOrderRequest);
            return true;
        }
        return false;
    }
}
