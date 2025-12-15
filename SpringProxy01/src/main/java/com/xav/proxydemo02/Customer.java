package com.xav.proxydemo02;

import java.lang.reflect.Proxy;

public class Customer {
    public static void main(String[] args) {
        System.out.println("客户找中介租房");
        Emp emp = new Emp();
        emp.setHost(new Host());
        // 三个参数:
        // 1. 类加载器
        // 2. 代理对象要实现的接口
        // 3. 代理对象的处理器, 需要做的事自己指定
        // 代理对象会实现Rent接口, 并调用处理器的invoke方法
        Rent proxy = (Rent) Proxy.newProxyInstance(
                Customer.class.getClassLoader(),
                new Class[]{Rent.class},
                emp
        );
        proxy.rent(5000);
    }
}
