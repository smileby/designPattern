package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:19
 * @Description： 定义Element（抽象元素）
 */
public interface Element {
    float accept(Visitor visitor);
}
