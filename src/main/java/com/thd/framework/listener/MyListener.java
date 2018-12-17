package com.thd.framework.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener {

	@Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("MyListener sessionCreated-----");
    }
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("MyListener sessionDestroyed-----");
    }

}
