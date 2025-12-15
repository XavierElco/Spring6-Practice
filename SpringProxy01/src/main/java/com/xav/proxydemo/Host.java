package com.xav.proxydemo;

public class Host implements Rent{
    @Override
    public Object rentHouse(double money) {
        System.out.println("房东要出租房子，租金：" + money);
        return new Object();
    }
}
