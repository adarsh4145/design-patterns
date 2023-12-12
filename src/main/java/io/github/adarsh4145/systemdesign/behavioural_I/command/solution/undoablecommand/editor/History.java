package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.undoablecommand.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commands.push(command);
    }
    public UndoableCommand pop(){
        return commands.pop();
    }
    public int size(){
        return commands.size();
    }
}
