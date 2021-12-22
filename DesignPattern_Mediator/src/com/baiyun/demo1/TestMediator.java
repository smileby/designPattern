package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:31
 * @Description：
 */
public class TestMediator {

    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        Landlord landlord = new Landlord("张三", mediator); // 房东
        Renters renters = new Renters("李四", mediator); //  租客

        //中介结构要知道房主和租房者
        mediator.setLandlord(landlord);
        mediator.setRenters(renters);

        renters.contact("听说你那里有房出租.....");
        landlord.contact("是的!请问你需要租什么类型的房?");
    }
}
