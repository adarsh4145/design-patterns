package io.github.adarsh4145.designpatterns.behavioural_I.observer.pull;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        observers.forEach(
                Observer::update
        );
    }
}
