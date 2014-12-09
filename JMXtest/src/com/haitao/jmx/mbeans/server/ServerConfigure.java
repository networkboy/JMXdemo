package com.haitao.jmx.mbeans.server;

import java.util.concurrent.atomic.AtomicLong;

import javax.management.AttributeChangeNotification;
import javax.management.NotificationBroadcasterSupport;

public class ServerConfigure extends NotificationBroadcasterSupport implements ServerConfigureMBean {

    private AtomicLong sequenceNumber = new AtomicLong(1);
    private int        port;
    private String     host;

    @Override
    public void setPort(int port) {
        // TODO Auto-generated method stub
        int oldPort = this.port;
        this.port = port;
        AttributeChangeNotification notification = new AttributeChangeNotification(
                                                                                   this,
                                                                                   sequenceNumber.getAndIncrement(),
                                                                                   System.currentTimeMillis(),
                                                                                   AttributeChangeNotification.ATTRIBUTE_CHANGE,
                                                                                   "server port Change",
                                                                                   "java.lang.integer", oldPort + "",
                                                                                   this.port + "");
        // AttributeChangeNotification notification = new AttributeChangeNotification(source, sequenceNumber, timeStamp,
        // msg, attributeName, attributeType, oldValue, newValue)
        super.sendNotification(notification);
    }

    @Override
    public int getPort() {
        // TODO Auto-generated method stub
        return port;
    }

    @Override
    public void setHost(String host) {
        // TODO Auto-generated method stub
        String oldHost = this.host;
        this.host = host;
        AttributeChangeNotification notification = new AttributeChangeNotification(
                                                                                   this,
                                                                                   sequenceNumber.getAndIncrement(),
                                                                                   System.currentTimeMillis(),
                                                                                   AttributeChangeNotification.ATTRIBUTE_CHANGE,
                                                                                   "Server Host Change",
                                                                                   "java.lang.String", oldHost,
                                                                                   this.host);
        super.sendNotification(notification);
    }

    @Override
    public String getHost() {
        // TODO Auto-generated method stub
        return host;
    }

}
