package com.test.spring.aop;

import com.test.spring.aop.impl.ManSpeakImpl;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class PersonProxyFactory {

    public static ISpeak newJdkProxy() {
        DynamicProxySpeak dynamicProxy = new DynamicProxySpeak(new ManSpeakImpl());
        ISpeak proxy = dynamicProxy.getProxy();
        return proxy;
    }
}
