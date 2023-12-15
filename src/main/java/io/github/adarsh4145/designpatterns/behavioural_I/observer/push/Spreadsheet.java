package io.github.adarsh4145.designpatterns.behavioural_I.observer.push;

public class Spreadsheet implements Observer {

    @Override
    public void update(String value) {
        System.out.println("spreadsheet got updated "+value);

    }
}
