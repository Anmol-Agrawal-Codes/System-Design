package CommandPattern.WithCommandPattern;

public class ItalicCommand implements Command {
    private TextEditor editor;

    public ItalicCommand(TextEditor editor){
        this.editor = editor;
    }

    @Override
    public void execute(){
        editor.itelicizeText();
    }
}
