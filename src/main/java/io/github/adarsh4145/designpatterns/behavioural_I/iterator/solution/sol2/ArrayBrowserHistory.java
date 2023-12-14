package io.github.adarsh4145.designpatterns.behavioural_I.iterator.solution.sol2;

public class ArrayBrowserHistory implements BrowserHistory {

    private final int total = 10;
    private final String[] urls = new String[total];
    private int count = 0;

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }


    @Override
    public void push(String url) throws Exception {
        if (count ==total)
            throw new Exception("overflow");
        urls[count++] = url;
    }

    @Override

    public String pop() throws Exception {
        if(count == 0)
            throw new Exception("underflow");
        var value = urls[--count];
        urls[count] = null;
        return value;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String get(int index) {
        return urls[index];
    }
}
