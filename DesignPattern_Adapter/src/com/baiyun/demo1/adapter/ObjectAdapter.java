package com.baiyun.demo1.adapter;

import com.baiyun.demo1.adaptee.AC;
import com.baiyun.demo1.target_.IDC;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:06
 * @Description： 对象适配器
 *
 * 对象适配器，不是继承源类，而是依据关联关系，持有源类的对象，这也隐藏了源类的方法。
 * 在这里，适配器和源类的关系不是继承关系，而是组合关系。
 */
public class ObjectAdapter implements IDC {

    private AC ac;

    public ObjectAdapter(AC ac) {
        this.ac = ac;
    }

    public int outputAC(){
        return ac.outputAC();
    }

    @Override
    public int outputDC() {
        return ac.outputAC()/44;
    }
}
