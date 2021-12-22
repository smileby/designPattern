package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:28
 * @Description： 定义抽象同事Person
 */
public abstract class Person {
    private String name;
    private Mediator mediator;

    Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
