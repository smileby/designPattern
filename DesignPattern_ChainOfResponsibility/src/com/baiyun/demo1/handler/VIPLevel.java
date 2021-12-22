package com.baiyun.demo1.handler;

import com.baiyun.demo1.entity.User;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:13
 * @Description： TODO
 */
public class VIPLevel extends LevelHandler {

    private static final int needPoint = 10000;

    @Override
    public void handleAction(User user, int point) {
        System.out.println("VIPLevel start process");
        // 业务逻辑
    }
}
