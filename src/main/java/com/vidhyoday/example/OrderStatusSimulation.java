package com.vidhyoday.example;

public class OrderStatusSimulation {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.CREATED;
        boolean flagOfStatus = status.something();


//        while (!status.isFinal()) {
//            System.out.println("Current Status: " + status);
//            switch (status) {
//                case CREATED:
//                    status = OrderStatus.PAID;
//                    break;
//                case PAID:
//                    status = OrderStatus.SHIPPED;
//                    break;
//                case SHIPPED:
//                    status = OrderStatus.DELIVERED;
//                    break;
//                default:
//                    throw new IllegalStateException("Unexpected value: " + status);
//            }
//        }
        System.out.println("Final Status: " + status.isFinal());
    }
}
