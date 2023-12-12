package io.github.adarsh4145.systemdesign.behavioural_I.memento.mysolution;

import lombok.*;

public class MyEditor {
    @Getter
    private String content;
    private final MyState state;

    public MyEditor(){
        content = "";
        state = new MyState();
    }

    public void setContent(String content) {
        state.pushValue(this.content);
        this.content = content;
    }

    public void undo(){
        this.content = state.popValue();
    }
}
