package com.zhl.structurepattern.facade;

/**
 * @author Zhanghualei
 * @Classname FacadeTest
 * @Date 2021/1/17 11:36
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeMethod();
    }

    static class Facade{
        private SubSystem1 subSystem1 = new SubSystem1();
        private SubSystem2 subSystem2 = new SubSystem2();


        void facadeMethod(){
            subSystem1.method1();
            subSystem2.method2();
        }
    }

    static class SubSystem1{
        void method1(){
            System.out.println("子系统1调用");
        }
    }
    static class SubSystem2{
        void method2(){
            System.out.println("子系统2调用");
        }
    }

}
