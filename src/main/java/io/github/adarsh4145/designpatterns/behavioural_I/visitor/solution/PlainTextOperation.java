package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("text-anchor");
    }
}
