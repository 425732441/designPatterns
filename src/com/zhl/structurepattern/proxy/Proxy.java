package com.zhl.structurepattern.proxy;

/**
 * @author Zhanghualei
 * @Classname Proxy
 * @Date 2021/1/13 17:03
 */
public class Proxy implements Subject{
    Subject subject;
    @Override
    public void request(){
        if (subject == null) {
            subject = new RealSubjectImpl();
        }
        preReq();
        subject.request();
        postReq();
    }
    public void preReq(){
        System.out.println("do pre req");
    }
    public void postReq(){
        System.out.println("do post req");
    }
}
