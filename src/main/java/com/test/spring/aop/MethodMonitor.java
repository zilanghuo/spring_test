package com.test.spring.aop;

/**
 * @author lwf
 * @date 2018/4/2
 * use: 单体方法
 */
public class MethodMonitor {

    private long start;

    private String method;

    public MethodMonitor(String method) {
        this.method = method;
        System.out.println("begin monitor..");
        this.start = System.currentTimeMillis();
    }

    public void log() {
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("end monitor..");
        System.out.println("Method: " + method + ", execution time: " + elapsedTime + " milliseconds.");
    }

}
