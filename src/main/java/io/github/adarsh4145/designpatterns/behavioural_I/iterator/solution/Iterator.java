package io.github.adarsh4145.systemdesign.behavioural_I.iterator.solution;

public interface Iterator {
    boolean hasNext();
    String current();
    void next();
}
//could have used Iterator <T> for generics