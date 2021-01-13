package com.zhl.structurepattern.proxy;


/**
 * @author Zhanghualei
 * @Classname Client
 * @Date 2021/1/13 17:08
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
