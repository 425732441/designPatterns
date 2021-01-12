package com.zhl.createpattern.factory.factorymethod;

/** 工厂方法模式
 * @author Zhanghualei
 * @Classname FactoryMethod
 * @Date 2021/1/12 22:59
 */
public class FactoryMethod {

    //抽象产品
    public interface Product {
        void show();
    }
    //玩具产品
    static class ToyProduct implements Product{
        public ToyProduct() {
            System.out.println("new toy");
        }

        @Override
        public void show() {
            System.out.println("show toy prod");
        }
    }
    //汽车产品
    static class CarProduct implements Product {
        public CarProduct() {
            System.out.println("new car");
        }

        @Override
        public void show() {
            System.out.println("show car prod");
        }
    }

    //抽象工厂
    public interface ProductFactory{
        Product getProduct();
    }
    //玩具产品工厂
    static class ToyProductFactory implements ProductFactory{

        @Override
        public Product getProduct() {
            return new ToyProduct();
        }
    }
    //汽车产品工厂
    static class CarProductFactory implements ProductFactory {
        @Override
        public Product getProduct() {
            return new CarProduct();
        }
    }

    public static void main(String[] args) {
        CarProductFactory carProductFactory = new CarProductFactory();
        Product carProduct = carProductFactory.getProduct();
        carProduct.show();
        ToyProductFactory toyProductFactory = new ToyProductFactory();
        Product toyProduct = toyProductFactory.getProduct();
        toyProduct.show();
    }

}
