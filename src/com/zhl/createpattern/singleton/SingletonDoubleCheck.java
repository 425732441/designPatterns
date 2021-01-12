package com.zhl.createpattern.singleton;

/**
 * 双重检查单例模式
 * @author Zhanghualei
 * @Classname SingletonDoubleCheck
 * @Date 2021/1/12 16:51
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {
        //私有化构造器
    }
    public static SingletonDoubleCheck getInstance(){
        //第一次检查
        if (instance == null) {
            //没有实例 需要创建 由于外层没加锁 此处可能有线程安全问题 所以下边代码块加锁
            synchronized (SingletonDoubleCheck.class){
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        System.out.println(instance1.equals(instance));
    }
}
