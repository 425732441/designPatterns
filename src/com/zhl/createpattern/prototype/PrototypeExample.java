package com.zhl.createpattern.prototype;

/**
 * @author Zhanghualei
 * @Classname PrototypeExample
 * @Date 2021/1/12 17:51
 */
public class PrototypeExample implements Cloneable{
    public PrototypeExample() {
        System.out.println("类创建成功");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeExample prototypeExample = new PrototypeExample();
        PrototypeExample clone = (PrototypeExample)prototypeExample.clone();

        System.out.println(prototypeExample);
        System.out.println(clone);
    }
}
