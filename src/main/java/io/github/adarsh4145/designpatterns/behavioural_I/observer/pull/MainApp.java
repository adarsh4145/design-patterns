package io.github.adarsh4145.designpatterns.behavioural_I.observer.pull;

public class MainApp {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet1 = new Spreadsheet(dataSource);
        var spreadSheet2 = new Spreadsheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);
        dataSource.setValue("23");
    }
}
