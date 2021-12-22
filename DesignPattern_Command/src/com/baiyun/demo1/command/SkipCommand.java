package com.baiyun.demo1.command;

import com.baiyun.demo1.receiver.MusicPlayer;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:27
 * @Description： TODO
 */
public class SkipCommand implements ICommand{
    private MusicPlayer player;

    public SkipCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.skip();
    }
}
