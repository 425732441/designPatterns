package com.zhl.structurepattern.bridge;

/**
 * @author Zhanghualei
 * @Classname BridgeTest
 * @Date 2021/1/13 20:22
 */
public class BridgeTest {
        public static void main(String[] args) {
            Implementor imple = new ConcreteImplementorA();
            Abstraction abs = new RefinedAbstraction(imple);
            abs.Operation();
        }

    //实现化角色
    interface Implementor {
        public void OperationImpl();
    }

    //具体实现化角色
    static class ConcreteImplementorA implements Implementor {
        @Override
        public void OperationImpl() {
            System.out.println("具体实现化(Concrete Implementor)角色被访问");
        }
    }

    //抽象化角色
    static abstract class Abstraction {
        protected Implementor imple;

        protected Abstraction(Implementor imple) {
            this.imple = imple;
        }

        public abstract void Operation();
    }

    //扩展抽象化角色
    static class RefinedAbstraction extends Abstraction {
        protected RefinedAbstraction(Implementor imple) {
            super(imple);
        }

        @Override
        public void Operation() {
            System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
            imple.OperationImpl();
        }
    }
}
