package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
