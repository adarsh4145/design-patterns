package io.github.adarsh4145.designpatterns.behavioural_I.chainofresp.solution;

public class Authenticator extends Handler {


    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        var isValid = (httpRequest.getUsername().equals("admin")&&
                httpRequest.getPassword().equals("nimda"));
        System.out.println("authentication: "+isValid);
        return !isValid;
    }
}
