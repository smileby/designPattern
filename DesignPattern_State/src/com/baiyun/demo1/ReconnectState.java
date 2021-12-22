package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:04
 * @Description： 定义具体状态角色ReconnectState
 */
public class ReconnectState implements ConnectState {

    @Override
    public void handleAction() {
        System.out.println("重新连接");
    }
}
