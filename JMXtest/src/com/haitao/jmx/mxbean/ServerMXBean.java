package com.haitao.jmx.mxbean;

public interface ServerMXBean {

    public ServerConfigure getServerConfigure();

    public void setServerConfigure(ServerConfigure serverConfigure);

    public void defaultServerConfigure();
}
