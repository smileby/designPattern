package com.baiyun.demo1;

import com.baiyun.demo1.entity.User;
import com.baiyun.demo1.handler.AdvancedLevel;
import com.baiyun.demo1.handler.NormalLevel;
import com.baiyun.demo1.handler.VIPLevel;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:15
 * @Description： TODO
 */
public class TestDemo1 {
    public static void main(String[] args) {
        NormalLevel normalLevel = new NormalLevel();
        AdvancedLevel advancedLevel = new AdvancedLevel();
        VIPLevel vipLevel = new VIPLevel();
        normalLevel.setNext(advancedLevel);
        advancedLevel.setNext(vipLevel);
        normalLevel.handleAction(new User(100, "text", 1000), 1000);
    }
}
