package com.zhl.createpattern.singleton;

/**
 * 懒汉式单例
 * 特点：获取实例时才创建对象
 * 缺点：获取实例的方法上加锁，多线程访问效率低
 * @author Zhanghualei
 * @Classname SingletonLazy
 * @Date 2021/1/12 16:41
 */
public class SingletonLazy {
    private static volatile SingletonLazy instance = null;

    private SingletonLazy() {
        //私有化构造方法 防止其他类实例化本类
    }

    /**
     * 方法上加锁  效率低
     * @author zhanghualei
     * @date 2021/1/12 16:56
     * @param
     */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance1 = SingletonLazy.getInstance();

        System.out.println(instance1.equals(instance));
        SingletonLazy instance2 = SingletonLazy.getInstance();


    }
}
