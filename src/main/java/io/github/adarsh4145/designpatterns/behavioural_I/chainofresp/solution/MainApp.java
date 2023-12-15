package io.github.adarsh4145.designpatterns.behavioural_I.chainofresp.solution;

public class MainApp {

    public static void main(String[] args) {
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin","nimda"));
        webServer.handle(new HttpRequest("admin","wrong"));

        var authenticator1 = new Authenticator(compressor);
        var webServer1 = new WebServer(authenticator1);
        webServer1.handle(new HttpRequest("admin","nimda"));

    }
}
