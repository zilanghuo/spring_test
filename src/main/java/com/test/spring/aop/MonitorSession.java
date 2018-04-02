package com.test.spring.aop;

/**
 * @author lwf
 * @date 2018/4/2
 * use:会话
 */
public class MonitorSession {

    private static ThreadLocal<MethodMonitor> monitorThreadLocal = new ThreadLocal<>();

    public static void begin(String method) {
        MethodMonitor logger = new MethodMonitor(method);
        monitorThreadLocal.set(logger);
    }

    public static void end() {
        MethodMonitor monitor = monitorThreadLocal.get();
        monitor.log();
    }

}
