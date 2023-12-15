package io.github.adarsh4145.designpatterns.behavioural_I.observer.solution;

public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("chart got updated");
    }
}
