package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("high light heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("high light anchor");

    }
}
