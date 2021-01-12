package com.zhl.createpattern.prototype;

/**
 * @author Zhanghualei
 * @Classname Circle
 * @Date 2021/1/12 20:30
 */
public class Circle implements Shape{
    @Override
    public Circle clone() {
        Circle clone = null;
        try {
            clone =  ((Circle)super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public void countArea() {
        System.out.println("计算圆形面积");
    }
}
