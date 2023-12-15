package io.github.adarsh4145.designpatterns.behavioural_I.observer.solution;

public class Spreadsheet implements Observer{
    @Override
    public void update() {
        System.out.println("spreadsheet got updated");
    }
}
