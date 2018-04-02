package com.test.spring.aop.staticDynamic;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class StaticProxy implements ISpeak {

    private ISpeak speak = new SpeakImpl();

    @Override
    public void speakBefore() {
        System.out.println("代理开始");
        speak.speakBefore();
        System.out.println("代理结束");
    }

    @Override
    public void speakAfter() {
        System.out.println("代理开始");
        speak.speakAfter();
        System.out.println("代理结束");
    }
}
