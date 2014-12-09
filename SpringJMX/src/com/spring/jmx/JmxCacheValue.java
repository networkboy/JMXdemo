package com.spring.jmx;

public class JmxCacheValue {

    static String name;

    public static String getName() {
        System.out.println("        getName      " + name);
        return name;

    }

    public static void setName(String name) {
        JmxCacheValue.name = name;
        System.out.println("      setName        " + getName());
    }

}
