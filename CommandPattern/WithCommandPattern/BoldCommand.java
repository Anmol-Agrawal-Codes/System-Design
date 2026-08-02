package CommandPattern.WithCommandPattern;

public class BoldCommand implements Command {

    private TextEditor editor;

    public BoldCommand(TextEditor editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.boldText();
    }
    
}
