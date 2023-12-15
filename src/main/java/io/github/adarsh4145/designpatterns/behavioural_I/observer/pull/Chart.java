package io.github.adarsh4145.designpatterns.behavioural_I.observer.pull;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("chart got updated: "+dataSource.getValue());
    }
}
