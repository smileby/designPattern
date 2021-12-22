package com.baiyun.demo1.invoker;

import com.baiyun.demo1.command.ICommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: BaiYun
 * @Date： 2021/12/22 14:36
 * @Description： TODO
 */
public class MacroMusicCommand implements IMacroCommand {

    private static final List<ICommand> commands = new ArrayList<>();

    @Override
    public void add(ICommand command) {
        commands.add(command);
    }

    @Override
    public void remove(ICommand command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        commands.forEach(ICommand::execute);
    }
}
