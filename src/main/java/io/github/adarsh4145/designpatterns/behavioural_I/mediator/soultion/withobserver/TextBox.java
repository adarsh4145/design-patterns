package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion.withobserver;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
