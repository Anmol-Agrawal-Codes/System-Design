package StatePattern.WithStatePattern;

public class Document {
    private State state = new DraftState();

    public void setState(State state){
        this.state = state;
    }

    public void publish(){
        state.publish(this);
    }
}
