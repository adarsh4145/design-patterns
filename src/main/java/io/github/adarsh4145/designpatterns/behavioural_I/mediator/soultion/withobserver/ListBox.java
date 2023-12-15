package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion.withobserver;

public class ListBox extends UIControl {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
