package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 16:14
 * @Description： 定义备忘录角色Memento
 */
public class Memento {
    private int level;//等级
    private int coin;//金币数量

    public Memento(int level, int coin) {
        this.level = level;
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public int getLevel() {
        return level;
    }
}
