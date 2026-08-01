import java.util.Stack;

public class Caretaker{
    // stores pure snapshots of editor without knowing anything inside of it.
    private Stack<EditorMemento> history = new Stack<>();

    public void saveSnapshot(TextEditor editor){
        history.push(editor.save()); // editor.save() -> because only editor should know what is its current state.
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            history.pop();

            if(!history.isEmpty()){
                editor.restore(history.peek());
            }
        }
        
    }
}