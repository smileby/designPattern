package com.baiyun.demo1;

public interface Iterator<T> {

    boolean hasNext();

    T first();

    T next();
}
