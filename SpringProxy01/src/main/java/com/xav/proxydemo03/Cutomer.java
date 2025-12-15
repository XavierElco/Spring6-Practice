package com.xav.proxydemo03;

import net.sf.cglib.proxy.Enhancer;

public class Cutomer {
    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        en.setSuperclass(Host.class);
        en.setCallback(new Emp(new Host()));
        Host proxy = (Host) en.create();
        proxy.rent(5000);
    }
}
