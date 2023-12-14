package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.compositecommand;

import io.github.adarsh4145.systemdesign.behavioural_I.command.solution.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("resizing");
    }
}
