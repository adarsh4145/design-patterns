package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion.withobserver;


import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers(){
        eventHandlers.forEach(eventHandler -> eventHandler.update());
    }


}
