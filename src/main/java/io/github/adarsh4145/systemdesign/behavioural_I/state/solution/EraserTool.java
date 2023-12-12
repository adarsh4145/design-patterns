package io.github.adarsh4145.systemdesign.behavioural_I.state.solution;

public class EraserTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("erase something");
    }

    @Override
    public void mouseDown() {
        System.out.println("eraser icon");
    }
}
