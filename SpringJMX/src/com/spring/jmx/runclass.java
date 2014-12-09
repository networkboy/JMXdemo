package com.spring.jmx;

import java.lang.management.ManagementFactory;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class runclass {

    int         i   = 0;
    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

    public void run() throws Exception {
        System.out.println("run.....");

        // mbs.registerMBean(mbs, name);
        // for (int i = 0; i < 100000000; i++) {
        // System.out.println("+++++++++++++++++++=runclass");
        // ObjectName name = new ObjectName("bean:name=HusbandLocal");
        // mbs.invoke(name, "setAge", new Object[] { i }, new String[] { "int" });
        // try {
        // Thread.sleep(1000);
        // store();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                try {
                    store();
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }, 1 * 1000, 1);// 1秒钟之后开始执行，每1分钟执行一次
    }

    public void store() throws Exception {

        JmxCacheValue jc = new JmxCacheValue();
        ObjectName name = new ObjectName("bean:name=HusbandLocal");
        mbs.invoke(name, "setAge", new Object[] { i++ }, new String[] { "int" });
        System.out.println("+++++++++++++++++++=runclass");
    }
}
