package com.baiyun.demo1;

import com.baiyun.demo1.adaptee.AC;
import com.baiyun.demo1.adapter.InterfaceAdapter;
import com.baiyun.demo1.adapter.ObjectAdapter;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:05
 * @Description： 测试类
 */
public class TestAdapter {

    public static void main(String[] args) {
        // 类适配器
//        ClassAdapter adapter = new ClassAdapter();
        // 对象适配器
        ObjectAdapter adapter = new ObjectAdapter(new AC());
        // 接口适配器
        InterfaceAdapter interfaceAdapter = new InterfaceAdapter(new AC());

        System.out.println("交流电电压:"  + adapter.outputAC());
        System.out.println("直流电电压:"  + adapter.outputDC());

        System.out.println("接口适配器5V电压：" + interfaceAdapter.output5V());
    }

}
