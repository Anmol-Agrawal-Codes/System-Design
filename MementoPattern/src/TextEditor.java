public class TextEditor{

    private String content;

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public EditorMemento save(){
        return new EditorMemento(content); // at the time of save it creates a snapshot of the current state and only editor should know what is happening at that time.
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
    }
}