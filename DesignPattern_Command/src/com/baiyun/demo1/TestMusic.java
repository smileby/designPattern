package com.baiyun.demo1;

import com.baiyun.demo1.command.ICommand;
import com.baiyun.demo1.command.PlayCommand;
import com.baiyun.demo1.command.SkipCommand;
import com.baiyun.demo1.command.StopCommand;
import com.baiyun.demo1.invoker.MacroMusicCommand;
import com.baiyun.demo1.invoker.MusicInvoker;
import com.baiyun.demo1.receiver.MusicPlayer;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:32
 * @Description： TODO
 */
public class TestMusic {
    public static void main(String[] args) {
        // 创建 Receiver(接收者)
        MusicPlayer musicPlayer = new MusicPlayer();
        // ICommand(抽象命令类)
        ICommand playCommand = new PlayCommand(musicPlayer);
        ICommand skipCommand = new SkipCommand(musicPlayer);
        ICommand stopCommand = new StopCommand(musicPlayer);
        // 创建 Invoker(调用者)
        MusicInvoker invoker = new MusicInvoker();
        invoker.setPlayCommand(playCommand);
        invoker.setSkipCommand(skipCommand);
        invoker.setStopCommand(stopCommand);
        // 测试
//        invoker.play();
//        invoker.skip();
//        invoker.stop();
//        invoker.play();
//        invoker.stop();

        testMacroCommand();
    }

    /**
     * 测试宏命令
     */
    public static void testMacroCommand(){
        // 创建 Receiver(接收者)
        MusicPlayer musicPlayer = new MusicPlayer();
        // ICommand(抽象命令类)
        ICommand playCommand = new PlayCommand(musicPlayer);
        ICommand skipCommand = new SkipCommand(musicPlayer);
        ICommand stopCommand = new StopCommand(musicPlayer);
        // 创建 Invoker(调用者)
        MacroMusicCommand invoker = new MacroMusicCommand();
        invoker.add(playCommand);
        invoker.add(skipCommand);
        invoker.add(stopCommand);
        // 测试
        invoker.execute();
    }
}
