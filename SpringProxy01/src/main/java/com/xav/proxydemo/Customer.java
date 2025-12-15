package com.xav.proxydemo;

public class Customer {
    public static void main(String[] args) {
        HouseProxy proxy = new HouseProxy(new Host());
        // 租客对接中介
        Object o = proxy.rentHouse(5000);
        System.out.println(o);
    }
}
