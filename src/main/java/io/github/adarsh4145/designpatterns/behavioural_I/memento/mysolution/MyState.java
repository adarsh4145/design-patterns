package io.github.adarsh4145.systemdesign.behavioural_I.memento.mysolution;

import java.util.Stack;

public class MyState {

    private final Stack<String> values;

    public MyState(){
        values = new Stack<>();
    }

    public void pushValue(String value){
        values.push(value);
    }

    public String popValue(){
        if(!values.empty())
            return values.pop();
        return "";
    }

}
