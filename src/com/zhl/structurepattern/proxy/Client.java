package com.zhl.structurepattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Zhanghualei
 * @Classname Client
 * @Date 2021/1/13 17:08
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
