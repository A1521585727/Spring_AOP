package com.baizhi.rlt.util;


import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyActive implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("--------------------");
    }


}
