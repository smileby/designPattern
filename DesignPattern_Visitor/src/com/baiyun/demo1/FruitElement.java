package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:22
 * @Description： 定义具体元素FruitElement
 */
public class FruitElement implements Element {

    private float price;
    private int num;

    public FruitElement(int num, float price) {
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
