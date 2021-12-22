package com.baiyun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 17:23
 * @Description： 定义对象结构ObjectStructure
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

        /**
         * 访问者访问元素的入口
         *
         * @param visitor 访问者
         */
        public void accept(Visitor visitor) {
            for (int i = 0; i < list.size(); i++) {
                Element element = list.get(i);
                element.accept(visitor);
            }
        }

        /**
         * 把元素加入到集合
         *
         * @param element 待添加的元素
         */
        public void addElement(Element element) {
            list.add(element);
        }

        /**
         * 把元素从集合中移除
         *
         * @param element 要移除的元素
         */
        public void removeElement(Element element) {
            list.remove(element);
        }
}
