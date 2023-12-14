package io.github.adarsh4145.systemdesign.behavioural_I.state.mysolution;

public class EraserTool extends Tool{
    ToolType toolType  = ToolType.ERASER;

    @Override
    void mouseUp() {
        System.out.println("eraser icon");

    }

    @Override
    void mouseDown() {
        System.out.println("erase something");

    }
}
