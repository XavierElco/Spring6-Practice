package com.xav.proxydemo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Emp implements InvocationHandler {
    Host host = new Host();

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    // proxy：代理类对象
    // method：代理类对象调用的方法，被代理的方法 --> 当前案例中房东的rentHouse方法
    // args：代理类对象调用的方法时，传递的实际参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("看房子");
        System.out.println("签合同");
        System.out.println("收中介费");
        Object o = method.invoke(host,args);
        return o;
    }
}
