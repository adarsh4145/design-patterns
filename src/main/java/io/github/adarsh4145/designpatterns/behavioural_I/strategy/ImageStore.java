package io.github.adarsh4145.systemdesign.behavioural_I.strategy;

public class ImageStore {
    private String compressor;
    private String filter;

    public ImageStore(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if(compressor.equals("jpeg"))
            System.out.println("compressing using jpeg");
        else if(compressor.equals("png"))
            System.out.println("compressing using png");

        if (filter.equals("high-contrast"))
            System.out.println("applying high-contrast filter");
        else if (filter.equals("b-and-w"))
            System.out.println("applying b-and-w filter");
    }
}
