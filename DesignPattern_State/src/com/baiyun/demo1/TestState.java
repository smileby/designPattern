package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:07
 * @Description：
 */
public class TestState {
    public static void main(String[] args) {
        Context context = new Context();
        context.reconnect();
        context.success();
        context.failure();
    }
}
