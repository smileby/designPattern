package com.baiyun.demo1.adapter;

import com.baiyun.demo1.adaptee.AC;
import com.baiyun.demo1.target_.DefaultIDCOutput;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:14
 * @Description： 接口适配器
 */
public class InterfaceAdapter extends DefaultIDCOutput {

    private AC ac;

    public InterfaceAdapter(AC ac) {
        this.ac = ac;
    }

    @Override
    public int output5V() {
        return ac.outputAC()/44;
    }
}
