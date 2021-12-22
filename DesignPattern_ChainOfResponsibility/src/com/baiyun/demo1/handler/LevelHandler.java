package com.baiyun.demo1.handler;

import com.baiyun.demo1.entity.User;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:10
 * @Description：
 */
public abstract class LevelHandler {
    protected LevelHandler next;

    public LevelHandler getNext(){
        return next;
    }

    public void setNext(LevelHandler next){
        this.next = next;
    }

    public abstract void handleAction(User user, int point);
}
