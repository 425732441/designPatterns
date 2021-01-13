package com.zhl.createpattern.builder;

/**
 * @author Zhanghualei
 * @Classname Product
 * @Date 2021/1/13 11:53
 */
public class Product {
    String partA;
    String partB;
    String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("show" + partA + partB + partC);
    }
}
