package com.baiyun.demo1.handler;

import com.baiyun.demo1.entity.User;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:12
 * @Description： TODO
 */
public class NormalLevel extends LevelHandler{

    private static final int needPoint = 1000;

    @Override
    public void handleAction(User user, int point) {
        System.out.println("NormalLevel start process");
        if (user.getUserPoint() + point > needPoint) {
            getNext().handleAction(user, point);
        } else {
            // 业务逻辑
        }
    }
}
