package com.spring.jmx;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class wtest {

    SimpleDateFormat ss = new SimpleDateFormat("ss"); // 定义毫秒格式

    @Test
    public void Test() throws Exception {
        for (int i = 0; i < 10000000; i++) {
            try {
                String str = ss.format(new Date().getTime());
                int ii = Integer.parseInt(str);
                Thread.sleep(1000);

                System.out.println("  Date().getTime() 时间=============:::" + new Date().getTime());
                System.out.println(" mm 时间=============:::" + ii);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
