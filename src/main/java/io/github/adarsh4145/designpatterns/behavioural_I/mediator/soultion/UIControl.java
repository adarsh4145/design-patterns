package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion;

public class UIControl {
    protected DialogBox owner;
    public UIControl(DialogBox dialogBox){
        this.owner = dialogBox;

    }
}
