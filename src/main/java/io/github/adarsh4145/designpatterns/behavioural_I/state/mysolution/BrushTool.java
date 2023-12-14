package io.github.adarsh4145.systemdesign.behavioural_I.state.mysolution;

public class BrushTool extends Tool{
    ToolType toolType  = ToolType.BRUSH;
    @Override
    void mouseUp() {
        System.out.println("brush icon");

    }

    @Override
    void mouseDown() {
        System.out.println("draw a line");

    }
}
