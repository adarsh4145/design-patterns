package io.github.adarsh4145.systemdesign.behavioural_I.iterator.solution.sol2;

public class ArrayIterator implements Iterator{
    ArrayBrowserHistory arrayBrowserHistory ;
    int index;

    public ArrayIterator(ArrayBrowserHistory arrayBrowserHistory){
        this.arrayBrowserHistory = arrayBrowserHistory;
    }

    @Override
    public boolean hasNext() {
        return index<arrayBrowserHistory.getCount();
    }

    @Override
    public String current() {
        return arrayBrowserHistory.get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
