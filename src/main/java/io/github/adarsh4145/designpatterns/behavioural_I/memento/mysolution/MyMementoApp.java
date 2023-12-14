package io.github.adarsh4145.designpatterns.behavioural_I.memento.mysolution;

public class MyMementoApp {
    public static void main(String[] args) {

        MyEditor editor = new MyEditor();

        editor.setContent("1");
        editor.setContent("2");
        editor.setContent("4");
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.setContent("4");
        System.out.println(editor.getContent());
        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println(editor.getContent());
        editor.setContent("4");
        System.out.println(editor.getContent());
    }

}
