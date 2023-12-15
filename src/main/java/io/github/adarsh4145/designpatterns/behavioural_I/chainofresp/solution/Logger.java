package io.github.adarsh4145.designpatterns.behavioural_I.chainofresp.solution;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    public void log(HttpRequest httpRequest){
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("log");
        return false;
    }
}
