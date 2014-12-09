package com.haitao.jmx;

public interface EchoMXBean {

    public String getName();

    public int getAge();

    public void setName(String name);

    public void printHello();

    public void printHello(String whoName);
}
