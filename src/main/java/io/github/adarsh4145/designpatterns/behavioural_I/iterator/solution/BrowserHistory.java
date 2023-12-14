package io.github.adarsh4145.designpatterns.behavioural_I.iterator.solution;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

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

    public static class ListIterator implements Iterator {

        private final BrowserHistory history;
        private int index;

        public ListIterator(BrowserHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }

    }

}
