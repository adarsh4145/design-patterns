package io.github.adarsh4145.systemdesign.behavioural_I.strategy.solution;

public class RGBFilter implements Filter{
    @Override
    public void filter(String filename) {
        System.out.println("applying rgb filter");
    }
}
