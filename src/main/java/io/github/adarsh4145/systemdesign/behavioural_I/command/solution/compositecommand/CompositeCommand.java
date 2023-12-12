package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.compositecommand;

import io.github.adarsh4145.systemdesign.behavioural_I.command.solution.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private final List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
