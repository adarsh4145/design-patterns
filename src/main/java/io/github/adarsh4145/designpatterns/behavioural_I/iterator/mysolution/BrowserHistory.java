package io.github.adarsh4145.systemdesign.behavioural_I.iterator.mysolution;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    private List<String> urls  = new ArrayList<>();

    public List<String> getUrls() {
        return urls;
    }

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        return urls.remove(urls.size()-1);
    }

}
