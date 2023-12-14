package io.github.adarsh4145.designpatterns.behavioural_I.iterator.solution.sol2;

public interface BrowserHistory {

    Iterator createIterator();

    void push(String url) throws Exception;

    String pop() throws Exception;
    int getCount();

    String get(int index);

}
