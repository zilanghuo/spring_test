package com.test.spring.aop.dynamicDemo;

import com.test.spring.aop.common.ISpeak;
import com.test.spring.aop.common.impl.ManSpeakImpl;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class DynamicProxyMain {

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy(new ManSpeakImpl());
        ISpeak speak = (ISpeak) dynamicProxy.newProxyInstance();
        speak.speakBefore();
        speak.speakAfter();
    }
}
