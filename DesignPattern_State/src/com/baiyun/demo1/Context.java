package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:05
 * @Description： 定义环境角色Context
 */
public class Context  {

    private ReconnectState reconnectState;
    private FailureState failureState;
    private SuccessState successState;

    public void reconnect() {
        if (reconnectState == null) {
            reconnectState = new ReconnectState();
        }
        reconnectState.handleAction();
    }

    public void failure() {
        if (failureState == null) {
            failureState = new FailureState();
        }
        failureState.handleAction();
    }

    public void success() {
        if (successState == null) {
            successState = new SuccessState();
        }
        successState.handleAction();
    }
}
