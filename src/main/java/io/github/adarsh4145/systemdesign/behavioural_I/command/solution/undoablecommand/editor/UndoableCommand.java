package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.undoablecommand.editor;

public interface UndoableCommand extends Command{
    void unExecute();
}
