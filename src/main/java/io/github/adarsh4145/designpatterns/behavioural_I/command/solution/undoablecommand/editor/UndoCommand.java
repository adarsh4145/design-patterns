package io.github.adarsh4145.designpatterns.behavioural_I.command.solution.undoablecommand.editor;

public class UndoCommand implements Command{
    private History history;
    public UndoCommand(History history){
        this.history = history;
    }
    @Override
    public void execute() {
        if (history.size() != 0) {
            history.pop().unExecute();
        }
    }
}
