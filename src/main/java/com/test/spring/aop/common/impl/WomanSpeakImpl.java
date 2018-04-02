package com.test.spring.aop.common.impl;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class WomanSpeakImpl implements ISpeak {

    @Override
    public void speakBefore() {
        System.out.println("women实现 speakBefore方法----------------------------");
    }

    @Override
    public void speakAfter() {
        System.out.println("woman实现 speakAfter方法-------------------------------");
    }
}
