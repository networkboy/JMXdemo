package com.spring.jmx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JMXTest {

    public static void main(String[] args) throws Exception {

        // System.out.print("wait");
        // // 通过死循环保证主线程一直运行
        // HusbandLocal mbean = new HusbandLocal();
        //

        // mbs.invoke(name, "setAge", null, null);
        // for (int i = 0; i < 1000; i++) {
        // mbean.setAge(i);
        // try {
        // Thread.sleep(1000);
        // System.out.print("    线程睡眠1秒！\n");
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // runclass rc = new runclass();
        // rc.run();
        // wtest w = new wtest();
        // w.Test();
        // MBeanServer mb = MBeanServerFactory.createMBeanServer("HusbandLocal");
        // MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        // ObjectName name = new ObjectName("bean:name=HusbandLocal");
        // mbs.invoke(name, "setMessage", new Object[] { "invoke" }, new String[] { "java.lang.String" });
        // mbs.invoke(name, "setName", new Object[] { "wxwinvoke" }, new String[] { "java.lang.String" });
        //
        // for (int i = 0; i < 100000000; i++) {
        // MBeanServer mbss = ManagementFactory.getPlatformMBeanServer();
        // ObjectName namee = new ObjectName("bean:name=HusbandLocal");
        // mbss.invoke(namee, "setAge", new Object[] { i }, new String[] { "int" });
        // try {
        // Thread.sleep(1000);
        // if (mbss == mbs) System.out.print("    线程睡眠1秒！\n" + mbss.isRegistered(namee) + ",,,,,,,,,,,,,,,,,"
        // + mbss);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // while (true) {
        //
        // }

    }
}
