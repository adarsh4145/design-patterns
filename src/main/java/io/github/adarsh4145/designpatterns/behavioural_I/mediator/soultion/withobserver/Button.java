package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion.withobserver;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
