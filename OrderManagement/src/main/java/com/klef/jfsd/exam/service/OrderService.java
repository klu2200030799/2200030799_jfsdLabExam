package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Order;

import java.util.Optional;

public interface OrderService {
    Order addOrder(Order order);

    Optional<Order> getOrderById(String orderId);

    void deleteOrder(String orderId);

    Order updateOrder(Order order);
}
