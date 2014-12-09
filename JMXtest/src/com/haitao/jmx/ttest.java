package com.haitao.jmx;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

import org.junit.Test;

public class ttest {

    runclass    r           = new runclass();
    MBeanServer mBeanServer = null;

    @Test
    public void test() throws Exception {
        if (MBeanServerFactory.findMBeanServer(null).size() > 0) {
            mBeanServer = (MBeanServer) MBeanServerFactory.findMBeanServer(null).get(0);
        } else {
            mBeanServer = MBeanServerFactory.createMBeanServer();
        }
        // MBeanServer mbs = MBeanServerFactory.
        ObjectName name = new ObjectName("com.haitao.jmx:type=Echo");
        mBeanServer.registerMBean(mBeanServer, name);
        System.out.println("Test..................." + mBeanServer.isRegistered(name));
    }
}
