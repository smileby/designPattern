package com.baiyun.demo1.entity;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:09
 * @Description：
 */
public class User {

    private int userId;
    private String userName;
    private int userPoint;

    public User(int userId, String userName, int userPoint) {
        this.userId = userId;
        this.userName = userName;
        this.userPoint = userPoint;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public String getUserName() {
        return userName;
    }
}
