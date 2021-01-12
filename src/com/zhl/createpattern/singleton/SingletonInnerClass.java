package com.zhl.createpattern.singleton;

/**
 * 静态内部类方式实现单例
 * 特点：
 * 线程安全
 * 延迟加载（调用getinstance时才初始化）
 *
 * @author Zhanghualei
 * @Classname SingletonInnerClass
 * @Date 2021/1/12 17:07
 */
public class SingletonInnerClass {
    private SingletonInnerClass() {}

    private static class SingletonClassHolder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonClassHolder.INSTANCE;
    }

    public static void main(String[] args) {
        SingletonInnerClass instance = SingletonInnerClass.getInstance();
        SingletonInnerClass instance1 = SingletonInnerClass.getInstance();
        System.out.println(instance1.equals(instance));
    }
}
