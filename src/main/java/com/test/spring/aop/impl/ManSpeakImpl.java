package com.test.spring.aop.impl;

import com.test.spring.aop.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class ManSpeakImpl implements ISpeak {

    @Override
    public void speakBefore() {
        try {
            Thread.currentThread().sleep(2 * 1000);
        } catch (Exception e) {

        }

        System.out.println("before:-----------------------------");
    }

    @Override
    public void speakAfter() {
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
        }
        System.out.println("after-------------------------------");
    }
}
