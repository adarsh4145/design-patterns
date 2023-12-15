package io.github.adarsh4145.designpatterns.behavioural_I.chainofresp.solution;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public void handle(HttpRequest httpRequest){
        if(doHandle(httpRequest)) {
            return;
        }
        if(next!=null)
            next.handle(httpRequest);
    }

    public abstract boolean doHandle(HttpRequest httpRequest);
}
