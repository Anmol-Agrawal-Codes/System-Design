package CommandPattern.WithoutCommandPattern;

public class UnderlineButton {
    private TextEditor editor;

    public UnderlineButton(TextEditor editor){
        this.editor = editor;
    }

    public void click(){
        editor.underlineText();
    }
}
