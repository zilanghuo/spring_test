package com.test.spring.aop.staticDynamic;

import com.test.spring.aop.common.ISpeak;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class StaticMain {

    public static void main(String[] args) {
        ISpeak speak = new StaticSpeakImpl();
        speak.speakBefore();
        speak.speakAfter();

    }

}
