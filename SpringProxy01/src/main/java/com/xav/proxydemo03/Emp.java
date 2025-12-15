package com.xav.proxydemo03;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Emp implements MethodInterceptor {
    Host host = new Host();

    public Emp(Host host) {
        this.host = host;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 调用真实对象的方法
        Object invoke = method.invoke(host, objects);
        return invoke;
    }
}
