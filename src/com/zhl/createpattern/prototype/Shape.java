package com.zhl.createpattern.prototype;

/**
 * @author Zhanghualei
 * @Classname Shape
 * @Date 2021/1/12 18:01
 */
public interface Shape extends Cloneable{
    public Object clone();
    public void countArea();
}
