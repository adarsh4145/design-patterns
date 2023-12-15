package io.github.adarsh4145.designpatterns.behavioural_I.mediator.soultion;

public class ArticlesDialogBox extends DialogBox{

    private ListBox  listBox= new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button button = new Button(this);

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

    @Override
    public void changed(UIControl control) {
        if(control == listBox){
            articleSelected();
        }else if (control == textBox){
            titleChanged();
        }
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
