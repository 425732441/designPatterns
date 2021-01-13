package com.zhl.createpattern.builder;

/**
 * @author Zhanghualei
 * @Classname Client
 * @Date 2021/1/13 12:06
 */
public class Client {
    public static void main(String[] args) {
        AbsBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.buildProduct();
        product.show();
    }
}
