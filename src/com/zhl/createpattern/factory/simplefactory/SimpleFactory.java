package com.zhl.createpattern.factory.simplefactory;

/**
 * @author Zhanghualei
 * @Classname SimpleFactory
 * @Date 2021/1/12 22:16
 */
public class SimpleFactory {
    public interface Product {
        void show();
    }

    static class ToyProduct implements Product {
        @Override
        public void show() {
            System.out.println("show toy");
        }
    }

    static class CarProduct implements Product {
        @Override
        public void show() {
            System.out.println("show car");
        }
    }

    static class Factory {
        public static Product getProduct(String id) {
            switch (id) {
                case "toy":
                    return new ToyProduct();
                case "car":
                    return new CarProduct();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Product toy = Factory.getProduct("toy");
        Product car = Factory.getProduct("car");
        toy.show();
        car.show();
    }
}
