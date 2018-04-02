package com.test.spring.aop;

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
public class DynamicProxySpeak implements InvocationHandler {

    private Object target;

    public DynamicProxySpeak(Object object){
        this.target = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MonitorSession.begin(method.getName());
        Object invoke = method.invoke(target, args);
        MonitorSession.end();
        return invoke;
    }


    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

}
