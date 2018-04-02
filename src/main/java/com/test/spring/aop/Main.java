package com.test.spring.aop;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class Main {

    public static void main(String[] args) {
        // jdk dynamic proxy
        System.out.println("******** jdk dynamic proxy ******** ");
        ISpeak speak = PersonProxyFactory.newJdkProxy();
        speak.speakBefore();
        speak.speakAfter();
    }
}
