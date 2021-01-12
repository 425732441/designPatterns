package com.zhl.createpattern.singleton;

/**
 * @author Zhanghualei
 * @Classname SingletonEnum
 * @Date 2021/1/12 17:23
 */
public enum  SingletonEnum {
    INSTANCE();


    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        System.out.println(instance1.equals(instance));
    }
}
