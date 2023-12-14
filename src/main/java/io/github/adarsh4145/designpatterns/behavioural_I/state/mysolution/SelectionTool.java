package io.github.adarsh4145.designpatterns.behavioural_I.state.mysolution;

public class SelectionTool extends Tool{
    ToolType toolType  = ToolType.SELECTION;

    @Override
    void mouseUp() {
        System.out.println("selection icon");

    }

    @Override
    void mouseDown() {
        System.out.println("draw dashed rectangle");

    }
}
