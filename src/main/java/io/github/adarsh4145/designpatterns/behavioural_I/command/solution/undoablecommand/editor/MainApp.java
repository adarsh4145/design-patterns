package io.github.adarsh4145.designpatterns.behavioural_I.command.solution.undoablecommand.editor;

public class MainApp {
    public static void main(String[] args) {
        var history = new History();
        var document = new  HtmlDocument();

        document.setContent("hello world");
        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());

        //boldCommand.unExecute();
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
