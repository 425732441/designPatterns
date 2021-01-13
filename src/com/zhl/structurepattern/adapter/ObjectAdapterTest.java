package com.zhl.structurepattern.adapter;

/**
 * @author Zhanghualei
 * @Classname ObjectAdapterTest
 * @Date 2021/1/13 19:40
 */
public class ObjectAdapterTest {
    static class Adaptee{
        public void specialMethod() {
            System.out.println("call adaptee method");
        }
    }

    interface Target{
        public void targetMethod();
    }

    static class ObjectAdapter implements Target {
        Adaptee adaptee;

        public ObjectAdapter(Adaptee adaptee) {
            this.adaptee = adaptee;
        }

        @Override
        public void targetMethod() {
            System.out.println("target method called");
            adaptee.specialMethod();
        }
    }

    public static void main(String[] args) {
        Target objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.targetMethod();
    }
}
