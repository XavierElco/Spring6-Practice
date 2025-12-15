package com.xav.advice;

import org.aspectj.lang.ProceedingJoinPoint;


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

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("------ 环绕前通知的前置通知 -------");
        Object o = pjp.proceed();
        return o;
    }

}
