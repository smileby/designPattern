package com.baiyun.demo1.target_;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:13
 * @Description： 中间类，空实现所有方法，这是一个抽象类
 */
public abstract class DefaultIDCOutput implements IDCOutput{
    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output20V() {
        return 0;
    }
}
