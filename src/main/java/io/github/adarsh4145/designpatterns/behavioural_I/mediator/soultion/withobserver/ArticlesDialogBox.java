package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion.withobserver;


public class ArticlesDialogBox {

    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button button = new Button();

    public ArticlesDialogBox(){
        listBox.addEventHandler(this::articleSelected);
        textBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        listBox.setSelection("article 1");
        System.out.println("text box: "+textBox.getContent());
        System.out.println("button: "+button.isEnabled());
        listBox.setSelection("");
        System.out.println("text box: "+textBox.getContent());
        System.out.println("button: "+button.isEnabled());
        listBox.setSelection("article 2");
        System.out.println("text box: "+textBox.getContent());
        System.out.println("button: "+button.isEnabled());
    }

    private void articleSelected(){
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }

    private void titleChanged(){
        var isEmpty = textBox.getContent()!=null && !textBox.getContent().isEmpty();
        button.setEnabled(isEmpty);
    }
}
