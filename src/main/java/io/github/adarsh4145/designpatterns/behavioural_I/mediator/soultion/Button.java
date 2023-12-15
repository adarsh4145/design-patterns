package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion;

public class Button extends UIControl{
    private boolean isEnabled;

    public Button(DialogBox dialogBox) {
        super(dialogBox);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }
}
