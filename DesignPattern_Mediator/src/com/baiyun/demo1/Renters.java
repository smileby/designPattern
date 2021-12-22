package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:29
 * @Description： 定义具体同事类Renters
 */
public class Renters extends Person {

    public Renters(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @desc 与中介者联系
     * @param message
     * @return void
     */
    public void contact(String message){
        getMediator().contact(message, this);
    }

    /**
     * @desc 获取信息
     * @param message
     * @return void
     */
    public void getMessage(String message){
        System.out.println("租房者: " + getName() +" ,收到房东回复消息：\"" + message + "\"");
    }
}
