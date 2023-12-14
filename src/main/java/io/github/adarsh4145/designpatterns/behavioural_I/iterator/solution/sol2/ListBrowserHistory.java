package io.github.adarsh4145.designpatterns.behavioural_I.iterator.solution.sol2;

import java.util.ArrayList;
import java.util.List;

public class ListBrowserHistory implements BrowserHistory {

    private final List<String> urls  = new ArrayList<>();

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        return urls.remove(urls.size()-1);
    }
    public int getCount(){
        return urls.size();
    }

    public String get(int index){
        return urls.get(index);
    }

}
