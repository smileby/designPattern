package com.baiyun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 15:12
 * @Description： TODO
 */
public class FilmMenuIterator implements Iterator<MenuItem>{

    private List<MenuItem> menuItemList = new ArrayList<>();
    private int position = 0;

    public FilmMenuIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public boolean hasNext() {
        if(position > menuItemList.size() -1 || null == menuItemList.get(position)){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem first() {
        return menuItemList.size() > 0 ? menuItemList.get(0) : null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemList.get(position);
        position++;
        return menuItem;
    }
}
