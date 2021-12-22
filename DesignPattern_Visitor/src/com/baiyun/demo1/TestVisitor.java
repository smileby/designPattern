package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:24
 * @Description： TODO
 */
public class TestVisitor {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new FoodElement(10, 2));
        objectStructure.addElement(new FruitElement(10, 2));
        objectStructure.accept(new ConcreteVisitor());
    }
}
