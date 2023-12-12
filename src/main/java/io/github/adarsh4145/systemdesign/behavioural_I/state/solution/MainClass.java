package io.github.adarsh4145.systemdesign.behavioural_I.state.solution;

public class MainClass {
    public static void main(String[] args) {
        var canvas = new Canvas();
        BrushTool currentToolBrush = new BrushTool();
        EraserTool currentToolErase = new EraserTool();
        SelectionTool currentToolSelect = new SelectionTool();
        canvas.setCurrentTool(currentToolBrush);
        canvas.mouseDown();
        canvas.setCurrentTool(currentToolErase);
        canvas.mouseUp();
        canvas.setCurrentTool(currentToolSelect);
        canvas.mouseDown();
    }
}
