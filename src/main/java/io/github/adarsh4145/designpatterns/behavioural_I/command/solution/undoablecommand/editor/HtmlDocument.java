package io.github.adarsh4145.designpatterns.behavioural_I.command.solution.undoablecommand.editor;

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
