package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 16:14
 * @Description： 定义备忘录管理员角色Caretaker
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
