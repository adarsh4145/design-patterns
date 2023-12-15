package io.github.adarsh4145.designpatterns.behavioural_I.observer.push;

public class DataSource extends Subject {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers(value);
    }
}
