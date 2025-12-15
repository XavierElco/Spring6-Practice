package com.xav.proxydemo03;

public class Host {
    public Object rent(double money) {
        System.out.println("房东要出租房子，租金：" + money);
        return new Object();
    }
}
