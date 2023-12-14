package io.github.adarsh4145.designpatterns.behavioural_I.state.mysolution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class Tool {
    ToolType toolType;
    abstract void mouseUp();
    abstract void mouseDown();

}
