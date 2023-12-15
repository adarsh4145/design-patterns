package io.github.adarsh4145.designpatterns.behavioural_I.observer.push;

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
    public void notifyObservers(String value){
        observers.forEach(
                observer -> observer.update(value)
        );
    }
}
