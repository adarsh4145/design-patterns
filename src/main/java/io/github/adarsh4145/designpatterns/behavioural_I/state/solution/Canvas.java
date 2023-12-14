package io.github.adarsh4145.systemdesign.behavioural_I.state.solution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Canvas {
    private Tool currentTool;

    public void mouseDown(){
        this.currentTool.mouseDown();
    }

    public void mouseUp(){
        this.currentTool.mouseUp();
    }


}
