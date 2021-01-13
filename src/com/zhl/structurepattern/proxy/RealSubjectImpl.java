package com.zhl.structurepattern.proxy;

/**
 * @author Zhanghualei
 * @Classname RealSubjectImpl
 * @Date 2021/1/13 17:02
 */
public class RealSubjectImpl implements Subject {
    @Override
    public void request() {
        System.out.println("do request");

    }
}
