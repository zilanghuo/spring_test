package com.test.spring.aop.common.impl;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class ManSpeakImpl implements ISpeak {

    @Override
    public void speakBefore() {
        System.out.println("实现 speakBefore方法----------------------------");
    }

    @Override
    public void speakAfter() {
        System.out.println("实现 speakAfter方法-------------------------------");
    }
}
