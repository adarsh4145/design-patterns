package io.github.adarsh4145.systemdesign.behavioural_I.memento.solution;

public class EditorState {
    private final String content;

    public EditorState(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

}
