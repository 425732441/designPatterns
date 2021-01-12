package com.zhl.createpattern.factory.abstractfactory;

/**
 * @author Zhanghualei
 * @Classname AbstractFactory
 * @Date 2021/1/12 23:40
 */
public class AbstractFactory {
    public interface Product {
        void show();
    }

    static class ToyProduct implements Product {

        @Override
        public void show() {
            System.out.println("toy prod show");
        }
    }

    static class CarProduct implements Product {

        @Override
        public void show() {
            System.out.println("car prod show");
        }
    }


    public interface SomeProduct {
        void doSomeThing();
    }

    static class TomProduct implements SomeProduct {

        @Override
        public void doSomeThing() {
            System.out.println("tom prod show");
        }
    }

    static class BMWProduct implements SomeProduct {

        @Override
        public void doSomeThing() {
            System.out.println("BMW prod show");
        }
    }

    public interface AbsFactory{
        Product getProduct();
        SomeProduct getSomeProduct();
    }

    static class ProdFactory implements AbsFactory{

        @Override
        public Product getProduct() {
            return new ToyProduct();
        }

        @Override
        public SomeProduct getSomeProduct() {
            return new TomProduct();
        }
    }

    static class SomeProdFactory implements AbsFactory {

        @Override
        public Product getProduct() {
            return new CarProduct();
        }

        @Override
        public SomeProduct getSomeProduct() {
            return new BMWProduct();
        }
    }


    public static void main(String[] args) {
        AbsFactory prodFactory = new ProdFactory();
        Product product = prodFactory.getProduct();
        SomeProduct someProduct = prodFactory.getSomeProduct();
        product.show();
        someProduct.doSomeThing();
        SomeProdFactory someProdFactory = new SomeProdFactory();
        Product product1 = someProdFactory.getProduct();
        product1.show();
        SomeProduct someProduct1 = someProdFactory.getSomeProduct();
        someProduct1.doSomeThing();

    }
}
