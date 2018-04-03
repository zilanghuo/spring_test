package com.test.spring.aop.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before intercept--------------------");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("after intercept---------------------");
        return invoke;
    }
}
