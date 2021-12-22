package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:22
 * @Description： TODO
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public float visit(FoodElement food) {
        return food.getNum() * food.getPrice();
    }

    @Override
    public float visit(FruitElement fruit) {
        return fruit.getNum() * fruit.getPrice();
    }
}
