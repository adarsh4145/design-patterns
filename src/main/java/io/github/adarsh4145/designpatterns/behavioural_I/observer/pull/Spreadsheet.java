package io.github.adarsh4145.designpatterns.behavioural_I.observer.pull;


public class Spreadsheet implements Observer {
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("spreadsheet got updated: "+dataSource.getValue());
    }
}
