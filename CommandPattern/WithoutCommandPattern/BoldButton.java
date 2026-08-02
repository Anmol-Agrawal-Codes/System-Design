package CommandPattern.WithoutCommandPattern;

class BoldButton {
    private TextEditor editor;

    public BoldButton(TextEditor editor){
        this.editor = editor;
    }
    
    public void click(){
        editor.boldText();
    }
}
