package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

public class MainApp {
    public static void main(String[] args) {
        var document  = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}
