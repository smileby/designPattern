package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 16:13
 * @Description： 定义发起人角色Game 类
 */
public class Game {

    private int level = 1;
    private int coin = 0;


    public void upgrade() {
        level++;
        coin += level * 100;
    }


    public void  exit(){
        // 退出游戏逻辑
    }

    public Memento createMemento() {
        return new Memento(level, coin);
    }

    public void setMemento(Memento memento) {
        this.level = memento.getLevel();
        this.coin = memento.getCoin();
    }
}
