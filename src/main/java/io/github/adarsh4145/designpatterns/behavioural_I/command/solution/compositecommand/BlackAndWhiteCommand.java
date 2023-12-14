package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.compositecommand;

import io.github.adarsh4145.systemdesign.behavioural_I.command.solution.framework.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("black and white");
    }
}
