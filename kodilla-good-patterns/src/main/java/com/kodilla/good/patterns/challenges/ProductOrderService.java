package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.List;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final List<Order> orders) {
        int noOrder = orders.get(0).getOrderNumber();
        LocalDate deliveryDay = orders.get(0).getDeliveryDate();
        String productName = orders.get(0).getProduct().getProductName();
        double orderPrice =orders.get(0).getProduct().getProductPrince() * orders.get(0).getAmount();

        boolean isOrderInProgress = orderService.status(noOrder, deliveryDay , orderPrice);

        if (isOrderInProgress) {
            informationService.sendMessageToBuyer(productName);
            orderRepository.addOrderToExecute(noOrder);

        } else {
            informationService.sendMessageToSeller(productName);
            orderRepository.saveOrderHistory(noOrder);

        }
        return new OrderDTO(noOrder, isOrderInProgress);
    }
}
