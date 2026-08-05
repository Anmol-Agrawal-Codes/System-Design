package StatePattern.WithStatePattern;

public class ModerationState implements State {
    @Override
    public void publish(Document document){
        System.out.println("Publishing Document");
        document.setState(new PublishState());
    }
}
