package com.baiyun.demo2;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 11:03
 * @Description：
 */
public class ComputerDirector {

    public void makeComputer(ComputerBuilder builder){
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }

}
