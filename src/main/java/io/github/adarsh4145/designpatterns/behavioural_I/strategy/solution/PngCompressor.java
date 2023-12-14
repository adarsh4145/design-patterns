package io.github.adarsh4145.systemdesign.behavioural_I.strategy.solution;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("compressing using png");
    }
}
