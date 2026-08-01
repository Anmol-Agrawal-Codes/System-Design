public class EditorMemento {

    private final String content; // final content -> state can't be modified even if the editor changes after saving.

    public EditorMemento(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}