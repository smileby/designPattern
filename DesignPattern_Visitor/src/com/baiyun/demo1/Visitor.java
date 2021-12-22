package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:19
 * @Description： 定义Visitor（抽象访问者）
 */
public interface Visitor {

    float visit(FoodElement food);

    float visit(FruitElement fruit);
}
