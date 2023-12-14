package io.github.adarsh4145.designpatterns.behavioural_I.command.solution.undoablecommand.editor;

public interface UndoableCommand extends Command{
    void unExecute();
}
