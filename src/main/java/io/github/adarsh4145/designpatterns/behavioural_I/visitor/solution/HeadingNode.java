package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

public class HeadingNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
