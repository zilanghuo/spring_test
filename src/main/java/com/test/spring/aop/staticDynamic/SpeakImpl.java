package com.test.spring.aop.staticDynamic;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use: 被代理类型的实现
 */
public class SpeakImpl implements ISpeak{


    @Override
    public void speakBefore() {
        System.out.println("static before-------------------------");
    }

    @Override
    public void speakAfter() {
        System.out.println("static after--------------------------");
    }
}
