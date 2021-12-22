package com.baiyun.demo1.handler;

import com.baiyun.demo1.entity.User;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:13
 * @Description： TODO
 */
public class AdvancedLevel extends LevelHandler {

    private static final int needPoint = 5000;

    @Override
    public void handleAction(User user, int point) {
        System.out.println("AdvancedLevel start process");
        if (user.getUserPoint() + point > needPoint) {
            getNext().handleAction(user, point);
        } else {
            // 业务逻辑
        }
    }
}