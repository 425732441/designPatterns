package com.zhl.structurepattern.adapter;

/**
 * @author Zhanghualei
 * @Classname ClassAdapterTest
 * @Date 2021/1/13 19:35
 */
public class ClassAdapterTest {
    static class Adaptee {
        public void specialMethod() {
            System.out.println("call adaptee method");
        }
    }

    interface Target {
        void targetMethod();
    }

    static class ClassAdapter extends Adaptee implements Target {

        @Override
        public void targetMethod() {
            System.out.println("target method call");
            super.specialMethod();
        }
    }

    public static void main(String[] args) {
        Target classAdapter = new ClassAdapter();
        classAdapter.targetMethod();
    }
}
