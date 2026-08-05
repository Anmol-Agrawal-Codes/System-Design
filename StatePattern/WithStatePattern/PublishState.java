package StatePattern.WithStatePattern;

public class PublishState implements State {

    @Override
    public void publish(Document document) {
        System.out.println("Document already published.");
    }
}
