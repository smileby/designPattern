package com.baiyun.demo1;

public interface MenuAggregate<T> {

    void addItem(int id, String name);

    Iterator<T> create();
}
