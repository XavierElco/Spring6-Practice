package com.xav.proxydemo02;

public class Host implements Rent{
    @Override
    public Object rent(double money) {
        System.out.println("房东出租房子，租金：" + money);

        return new Object();
    }
}
