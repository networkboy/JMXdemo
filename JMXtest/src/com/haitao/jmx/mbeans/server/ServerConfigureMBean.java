package com.haitao.jmx.mbeans.server;

public interface ServerConfigureMBean {

    public void setPort(int port);

    public int getPort();

    public void setHost(String host);

    public String getHost();
}
