package com.zhl.createpattern.singleton;

/**
 * 饿汉式单例
 * 特点：类加载时初始化 内存浪费 不能延迟加载  影响垃圾回收
 *
 * @author Zhanghualei
 * @Classname SingletonHungry
 * @Date 2021/1/12 17:02
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }
    public static SingletonHungry getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonHungry instance = SingletonHungry.getInstance();
        SingletonHungry instance1 = SingletonHungry.getInstance();
        System.out.println(instance.equals(instance1));
    }
}
