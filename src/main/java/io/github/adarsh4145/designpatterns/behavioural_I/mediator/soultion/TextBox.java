package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion;

public class TextBox extends UIControl{
    private String content;

    public TextBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}
