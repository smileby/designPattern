package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:28
 * @Description： 定义具体同事Landlord
 */
public class Landlord extends Person {

    public Landlord(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @desc 与中介者联系
     * @param message
     * @return void
     */
    public void contact(String message){
        super.getMediator().contact(message, this);
    }

    /**
     * @desc 获取信息
     * @param message
     * @return void
     */
    public void getMessage(String message){
        System.out.println("房  东: " + getName() +" ,收到租客消息：\"" + message + "\"");
    }
}