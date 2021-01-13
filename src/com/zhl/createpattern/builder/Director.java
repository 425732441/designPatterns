package com.zhl.createpattern.builder;

/**
 * @author Zhanghualei
 * @Classname Director
 * @Date 2021/1/13 12:03
 */
public class Director {
    AbsBuilder builder;

    public Director(AbsBuilder builder) {
        this.builder = builder;
    }

    public Product buildProduct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
