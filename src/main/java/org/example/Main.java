package org.example;

import org.example.Entities.Enums.OrderStatus;
import org.example.Entities.Order;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVILERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVILERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}