package io.github.adarsh4145.designpatterns.behavioural_I.strategy.solution;

public class MainApp {
    public static void main(String[] args) {

        Filter blackAndWhiteFilter = new BlackAndWhiteFilter();
        Filter rgbFilter = new RGBFilter();
        Compressor pngCompressor = new PngCompressor();
        Compressor jpegCompressor = new JpegCompressor();

        ImageStorage imageStorage1 = new ImageStorage(pngCompressor, blackAndWhiteFilter);
        ImageStorage imageStorage2 = new ImageStorage(pngCompressor, rgbFilter);
        ImageStorage imageStorage3 = new ImageStorage(jpegCompressor, blackAndWhiteFilter);
        ImageStorage imageStorage4 = new ImageStorage(jpegCompressor, rgbFilter);

        imageStorage1.store("file1");
        imageStorage2.store("file2");
        imageStorage3.store("file3");
        imageStorage4.store("file4");


    }
}
