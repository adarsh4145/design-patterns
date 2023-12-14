package io.github.adarsh4145.designpatterns.behavioural_I.command.solution.compositecommand;

public class MainAppCompositeCommands {
    public static void main(String[] args) {
        var composite = new CompositeCommand();

        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();

    }
}
