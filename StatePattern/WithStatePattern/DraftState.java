package StatePattern.WithStatePattern;

public class DraftState implements State {
    
    @Override
    public void publish(Document document){
        System.out.println("Moving Document to Moderation.");
        document.setState(new ModerationState());
    }
}
