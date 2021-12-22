package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:19
 * @Description： 定义具体元素 FoodElement
 */
public class FoodElement implements Element {
    private float price;
    private int num;

    public FoodElement(int num, float price) {
        this.num = num;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    @Override
    public float accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
