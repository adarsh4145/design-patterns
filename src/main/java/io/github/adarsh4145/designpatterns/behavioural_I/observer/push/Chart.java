package io.github.adarsh4145.designpatterns.behavioural_I.observer.push;

public class Chart implements Observer {
    @Override
    public void update(String value) {
        System.out.println("chart got updated, "+value);
    }
}
