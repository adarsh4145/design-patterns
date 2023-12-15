package io.github.adarsh4145.designpatterns.behavioural_I.visitor.solution;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();
    public void add(HtmlNode node){
        nodes.add(node);
    }

    public void execute(Operation operation){
        nodes.forEach(node -> node.execute(operation));
    }

}
