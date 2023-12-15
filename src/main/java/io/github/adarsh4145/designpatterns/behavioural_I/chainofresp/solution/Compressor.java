package io.github.adarsh4145.designpatterns.behavioural_I.chainofresp.solution;

public class Compressor extends Handler{


    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("compress");
        return false;
    }
}
