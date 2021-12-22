package com.baiyun.demo1.invoker;

import com.baiyun.demo1.command.ICommand;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:29
 * @Description： TODO
 */
public class MusicInvoker {
    private ICommand playCommand;
    private ICommand skipCommand;
    private ICommand stopCommand;

    public void setPlayCommand(ICommand playCommand) {
        this.playCommand = playCommand;
    }

    public void setSkipCommand(ICommand skipCommand) {
        this.skipCommand = skipCommand;
    }

    public void setStopCommand(ICommand stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void skip() {
        skipCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }
}
