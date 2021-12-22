package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 10:44
 * @Description：
 */
public class TestComputerDemo1 {

    public static void main(String[] args) {
        Computer computer =
                new Computer.Builder("因特尔", "三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();
    }
}
