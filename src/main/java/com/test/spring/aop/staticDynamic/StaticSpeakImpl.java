package com.test.spring.aop.staticDynamic;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class StaticSpeakImpl implements ISpeak{


    @Override
    public void speakBefore() {
        System.out.println("static before-------------------------");
    }

    @Override
    public void speakAfter() {
        System.out.println("static after--------------------------");
    }
}
