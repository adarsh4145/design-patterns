package io.github.adarsh4145.systemdesign.behavioural_I.strategy.solution;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename){
        System.out.println("storing file: "+filename);
        compressor.compress(filename);
        filter.filter(filename);
    }


}
