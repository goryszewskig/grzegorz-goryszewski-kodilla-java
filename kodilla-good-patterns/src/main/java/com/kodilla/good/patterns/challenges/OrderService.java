package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {
    boolean status(int orderNumber, LocalDate deliveryDate, double orderPrice);
}
