package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion;

public class MainApp {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
