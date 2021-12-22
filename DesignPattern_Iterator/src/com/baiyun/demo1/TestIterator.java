package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:18
 * @Description：
 */
public class TestIterator {

    public static void main(String[] args) {
        FilmAggregate filmAggregate = new FilmAggregate();
        filmAggregate.addItem(1, "唐人街探案");
        filmAggregate.addItem(2, "反贪风暴");
        filmAggregate.addItem(3, "小猪佩奇");
        Iterator<MenuItem> menuItemIterator = filmAggregate.create();
        MenuItem first = menuItemIterator.first();
        System.out.println("first：" + first);
        while (menuItemIterator.hasNext()){
            MenuItem next = menuItemIterator.next();
            System.out.println(next);
        }
    }
}
