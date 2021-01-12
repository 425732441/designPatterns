package com.zhl.createpattern.prototype;

/**
 * @author Zhanghualei
 * @Classname Square
 * @Date 2021/1/12 20:33
 */
public class Square implements Shape {
    @Override
    public Square clone() {
        Square square = null;
        try {
            square = (Square)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return square;
    }

    @Override
    public void countArea() {
        System.out.println("计算方型面积");
    }
}
