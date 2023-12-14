package io.github.adarsh4145.designpatterns.behavioural_I.strategy.solution;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("compressing using jpeg");
    }
}
