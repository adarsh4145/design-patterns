package io.github.adarsh4145.systemdesign.behavioural_I.memento.solution;

public class MementoApp {

    public static void main(String[] args) {

        History history = new History();
        Editor editor = new Editor();
        editor.setContent("value 0");

        history.push(editor.createState());
        editor.setContent("value 1");

        history.push(editor.createState());
        editor.setContent("value 2");


        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        History historyEditor2 = new History();
        EditorV2 editorV2 = new EditorV2("init val",historyEditor2);
        editorV2.update("value 2",historyEditor2);
        editorV2.undo(historyEditor2);

        System.out.println(editorV2.getContent());


    }

}
