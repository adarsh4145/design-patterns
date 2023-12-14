package io.github.adarsh4145.designpatterns.behavioural_I.memento.solution;

import lombok.Getter;

@Getter
public class EditorV2 {
    private String content;

    public EditorV2(String content, History history){
        update(content,history);
    }

    public void update(String content, History history) {
        history.push(this.createState());
        setContent(content);
    }

    public String undo(History history) {
        String currentValue = this.content;
        this.restoreState(history.pop());
        return currentValue;
    }

    private void setContent(String content) {
        this.content = content;
    }
    private EditorState createState(){
        return new EditorState(this.content);
    }
    private void restoreState(EditorState state){
        this.content = state.getContent();
    }
}
