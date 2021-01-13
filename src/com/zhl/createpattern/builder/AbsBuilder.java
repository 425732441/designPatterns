package com.zhl.createpattern.builder;

/**
 * @author Zhanghualei
 * @Classname AbsBuilder
 * @Date 2021/1/13 11:55
 */
public interface AbsBuilder {
    Product product = new Product();
    void buildPartA();
    void buildPartB();
    void buildPartC();
    Product getResult();
}
