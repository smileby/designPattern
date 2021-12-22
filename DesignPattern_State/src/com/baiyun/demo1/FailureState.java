package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:05
 * @Description： 定义具体状态角色FailureState
 */
public class FailureState implements ConnectState {

    @Override
    public void handleAction() {
        System.out.println("失败处理");
    }
}
