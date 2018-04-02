package com.test.spring.aop.staticDynamic;

/**
 * @author lwf
 * @date 2018/4/2
 * use:
 */
public class StaticMain {

    public static void main(String[] args) {
       StaticProxy proxy = new StaticProxy();
       proxy.speakBefore();
       proxy.speakAfter();
    }

}
