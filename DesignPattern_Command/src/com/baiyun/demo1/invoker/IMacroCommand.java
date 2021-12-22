package com.baiyun.demo1.invoker;

import com.baiyun.demo1.command.ICommand;

public interface IMacroCommand extends ICommand{

    void add(ICommand command);

    void remove(ICommand command);
}
