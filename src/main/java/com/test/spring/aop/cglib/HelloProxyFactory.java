package com.test.spring.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author lwf
 * @date 2018/4/3
 * use:
 */
public class HelloProxyFactory {

    public static HelloConcrete getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloConcrete.class);
        enhancer.setCallback(new AroundAdvice());
        return (HelloConcrete) enhancer.create();
    }

}
