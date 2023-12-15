package io.github.adarsh4145.designpatterns.behavioural_I.observer.solution;

public class MainApp {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet1 = new Spreadsheet();
        var spreadSheet2 = new Spreadsheet();
        var chart = new Chart();

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);
        dataSource.setValue("23");
    }
}
