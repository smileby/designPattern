package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:30
 * @Description： 定义具体中介者MediatorStructure
 */
public class MediatorStructure extends Mediator {

    //首先中介结构必须知道所有房主和租房者的信息
    private Landlord landlord;
    private Renters renters;

    @Override
    public void contact(String message, Person person) {

        if (person == landlord) {
            //如果是房主，则租房者获得信息
            renters.getMessage(message);
        } else {
            //反之则是房主获得信息
            landlord.getMessage(message);
        }
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Renters getRenters() {
        return renters;
    }

    public void setRenters(Renters renters) {
        this.renters = renters;
    }
}
