package io.github.adarsh4145.designpatterns.behavioural_I.iterator.mysolution;

public class MainApp {
    public static void main(String[] args) throws Exception {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.push("url1");
        browserHistory.push("url2");

        browserHistory.pop();
        System.out.println(browserHistory.getUrls().get(browserHistory.getUrls().size()-1));

        BrowserHistoryV2 browserHistory2 = new BrowserHistoryV2();

        browserHistory2.push("url1");
        browserHistory2.push("url2");

        browserHistory2.pop();
        //breaking changes
        //System.out.println(browserHistory2.getUrls().get(browserHistory2.getUrls().size()-1));

    }
}
