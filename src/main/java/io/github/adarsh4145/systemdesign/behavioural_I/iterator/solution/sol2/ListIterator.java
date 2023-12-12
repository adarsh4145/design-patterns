package io.github.adarsh4145.systemdesign.behavioural_I.iterator.solution.sol2;

public class ListIterator implements Iterator {

    private final ListBrowserHistory history;
    int index;

    public ListIterator(ListBrowserHistory history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return index < history.getCount();
    }

    @Override
    public String current() {
        return history.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}