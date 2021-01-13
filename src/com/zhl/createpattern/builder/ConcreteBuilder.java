package com.zhl.createpattern.builder;

/**
 * @author Zhanghualei
 * @Classname ConcreteBuilder
 * @Date 2021/1/13 11:59
 */
public class ConcreteBuilder implements AbsBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("set partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("set partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("set partC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
