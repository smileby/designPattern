package com.baiyun.demo1;

/**
 * 定义抽象中介者Mediator
 */
public abstract class Mediator {

    //申明一个联络方法
    public abstract void contact(String message, Person person);
}
