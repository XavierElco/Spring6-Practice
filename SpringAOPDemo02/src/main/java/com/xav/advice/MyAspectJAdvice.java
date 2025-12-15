package com.xav.advice;

public class MyAspectJAdvice {


    public void before() {
        System.out.println("------ 前置通知 -------");
    }
    public void after() {
        System.out.println("------ 后置通知 -------");
    }

    public void myThrow() {
        System.out.println("------ 异常通知 -------");
    }

}
