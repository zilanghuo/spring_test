package com.test.spring.aop.cglib;

/**
 * @author lwf
 * @date 2018/4/3
 * use:
 */
public class Main {

    public static void main(String[] args) {
        HelloConcrete instance = HelloProxyFactory.getInstance();
        instance.sayHello();
    }
}
