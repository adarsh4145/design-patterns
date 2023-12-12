package io.github.adarsh4145.systemdesign.behavioural_I.command.solution.undoablecommand.editor;

public class BoldCommand implements UndoableCommand{

    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument htmlDocument, History history){
        this.document = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unExecute() {
        document.setContent(prevContent);
    }
}
