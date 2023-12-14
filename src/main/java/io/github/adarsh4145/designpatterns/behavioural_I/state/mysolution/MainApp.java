package io.github.adarsh4145.designpatterns.behavioural_I.state.mysolution;

public class MainApp {
    public static void main(String[] args) {

        Tool brushTool = new BrushTool();
        Tool eraserTool = new EraserTool();
        Tool selectionTool = new SelectionTool();

        Canvas canvas = new Canvas();
        canvas.setTool(brushTool);
        canvas.mouseUp();
        canvas.mouseDown();
        canvas.setTool(eraserTool);
        canvas.mouseUp();
        canvas.mouseDown();
        canvas.setTool(selectionTool);
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
