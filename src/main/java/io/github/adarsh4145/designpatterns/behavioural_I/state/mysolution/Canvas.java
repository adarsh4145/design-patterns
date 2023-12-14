package io.github.adarsh4145.designpatterns.behavioural_I.state.mysolution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Canvas {

    private Tool tool;

    public void mouseDown(){
        tool.mouseDown();
    }
    public void mouseUp(){
        tool.mouseUp();
    }

}
