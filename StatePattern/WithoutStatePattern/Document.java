package StatePattern.WithoutStatePattern;

enum State{
    DRAFT,
    MODERATION,
    PUBLISH
}

public class Document {
    private State state = State.DRAFT;

    public void publish(){
        switch (state) {
            case State.DRAFT:
                System.out.println("Moving document to moderation.");
                state = State.MODERATION;                
                break;
            case State.MODERATION:
                System.out.println("Publishing document.");
                state = State.PUBLISH;
                break;
            case State.PUBLISH:
                System.out.println("Document already published.");
            default:
                break;
        }
    }    
}
