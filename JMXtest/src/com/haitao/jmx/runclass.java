package com.haitao.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class runclass {

    Echo mbean = new Echo();

    public void registerJmx() throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.haitao.jmx:type=Echo");
        mbs.registerMBean(mbean, name);
        mbean.setAge(11);
        // for (int i = 0; i < 1000; i++) {
        // mbean.setAge(i);
        // try {
        // Thread.sleep(1000);
        // System.out.print("    线程睡眠1秒！\n");
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

    }

    public void changeAge(int age) {
        mbean.setAge(age);
    }

    public void changename(String name) {
        mbean.setName(name);
    }
}
