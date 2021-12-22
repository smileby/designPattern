package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:11
 * @Description： TODO
 */
public class MenuItem {

    private int id;

    private String name;

    public MenuItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
