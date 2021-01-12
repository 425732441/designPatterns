package com.zhl.createpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhanghualei
 * @Classname PrototypeManager
 * @Date 2021/1/12 20:36
 */
public class PrototypeManager {
    Map<String,Shape> map = new HashMap<>(16);

    public PrototypeManager() {
        map.put("Circle",new Circle());
        map.put("Square",new Square());
    }
    public Shape getShape(String shape){
        Shape tmp = map.get(shape);
        return (Shape)tmp.clone();
    }

    public static void main(String[] args) {
        PrototypeManager prototypeManager = new PrototypeManager();
        Shape circle = prototypeManager.getShape("Circle");
        circle.countArea();
        Shape square = prototypeManager.getShape("Square");
        square.countArea();
    }

}
