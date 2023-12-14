package io.github.adarsh4145.designpatterns.behavioural_I.memento.solution;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState editorState){
        editorStates.add(editorState);
    }
    public EditorState pop(){
        return editorStates.remove(editorStates.size()-1);
    }

}
