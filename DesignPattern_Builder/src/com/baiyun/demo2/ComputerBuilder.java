package com.baiyun.demo2;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 11:02
 * @Description：
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}