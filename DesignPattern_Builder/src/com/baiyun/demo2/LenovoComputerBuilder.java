package com.baiyun.demo2;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 11:03
 * @Description：
 */
public class LenovoComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }
    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }
    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }
    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}
