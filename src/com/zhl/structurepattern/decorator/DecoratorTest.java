package com.zhl.structurepattern.decorator;

/**
 * @author Zhanghualei
 * @Classname DecoratorTest
 * @Date 2021/1/13 20:49
 */
public class DecoratorTest {
    //抽象组件
    interface Component{
        void something();
    }
    //具体组件
    static class ConcreateComponent implements Component {

        @Override
        public void something() {
            System.out.println("component do something");
        }
    }
    //抽象装饰器
    abstract static class Decorator{
        Component component;

        public Decorator(Component component) {
            this.component = component;
        }
        public void something(){
            component.something();
        }
    }
    //具体装饰器
    static class ConcreateDecorator extends Decorator {

        public ConcreateDecorator(Component component) {
            super(component);
        }
        @Override
        public void something(){
            super.something();
            addFun();

        }

        private void addFun() {
            System.out.println("do add function");
        }


    }

    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        Decorator decorator = new ConcreateDecorator(component);

        decorator.something();
    }

}
