package com.test.spring.aop.dynamicDemo;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
@Data
public class DynamicProxy implements InvocationHandler {

    private Object speak;

    public DynamicProxy(Object speak){
        this.speak = speak;
    }

    public Object newProxyInstance(){
        System.out.println("生成代理对象实例----------------------------");
        return Proxy.newProxyInstance(speak.getClass().getClassLoader(),speak.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行invoke方法前---------------------------");
        Object invoke = method.invoke(speak, args);
        System.out.println("执行invoke方法后---------------------------");
        return invoke;
    }
}
