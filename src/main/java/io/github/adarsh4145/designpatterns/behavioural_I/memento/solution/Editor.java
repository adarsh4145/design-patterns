package io.github.adarsh4145.designpatterns.behavioural_I.memento.solution;

import lombok.Getter;

@Getter
public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }
    public EditorState createState(){
        return new EditorState(this.content);
    }
    public void restoreState(EditorState state){
        this.content = state.getContent();
    }
}
