package com.baiyun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:16
 * @Description： TODO
 */
public class FilmAggregate implements MenuAggregate<MenuItem>{

    private List<MenuItem> menuItemList;

    public FilmAggregate() {
        this.menuItemList = new ArrayList<>();
    }

    @Override
    public void addItem(int id, String name) {
        this.menuItemList.add(new MenuItem(id, name));
    }

    @Override
    public Iterator<MenuItem> create() {
        return new FilmMenuIterator(menuItemList);
    }
}
