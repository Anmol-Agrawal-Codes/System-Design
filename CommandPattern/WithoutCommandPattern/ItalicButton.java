package CommandPattern.WithoutCommandPattern;

public class ItalicButton {
    
    private TextEditor editor;

    public ItalicButton(TextEditor editor){
        this.editor = editor;
    }

    public void click(){
        editor.itelicizeText();
    }
}
