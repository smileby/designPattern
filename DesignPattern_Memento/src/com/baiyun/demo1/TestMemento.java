package com.baiyun.demo1;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 16:15
 * @Description： TODO
 */
public class TestMemento {
    public static void main(String[] args) {
        Game game = new Game();
        game.upgrade();
        Memento memento = game.createMemento();//创建存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);//保存存档
        game.exit();//退出游戏

        Game secondGame = new Game();
        secondGame.setMemento(caretaker.getMemento());//读取存档
    }
}
