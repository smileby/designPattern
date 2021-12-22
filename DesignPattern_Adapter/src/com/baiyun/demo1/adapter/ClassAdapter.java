package com.baiyun.demo1.adapter;

import com.baiyun.demo1.adaptee.AC;
import com.baiyun.demo1.target_.IDC;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:03
 * @Description： 类适配器
 *
 *  类适配器是通过继承源类，实现目标接口的方式实现适配的。但是，由于Java单继承的机制，这就要求目标必须是接口，有一定的局限性。
 */
public class ClassAdapter extends AC implements IDC {

    //直流电为交流电的电压值除以44
    @Override
    public int outputDC() {
        return super.outputAC()/44;
    }

}
