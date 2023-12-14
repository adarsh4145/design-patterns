package io.github.adarsh4145.designpatterns.behavioural_I.iterator.mysolution;

public class BrowserHistoryV2 {
    private int size = 50;
    private String[] urls = new String[size];
    private int index = -1;
    public void push(String url) throws Exception {
        if (index==size)
            throw new Exception("overflow");
        urls[index++] = url;
    }

    public String pop() throws Exception {
        if(index == -1)
            throw new Exception("underflow");
        var value = urls[index];
        urls[index--] = null;
        return value;
    }

    public String[] getUrls(){
        return urls;
    }
}
