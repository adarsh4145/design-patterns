package io.github.adarsh4145.designpatterns.behavioural_I.state.solution;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("draw dashed rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("selection icon");

    }
}
