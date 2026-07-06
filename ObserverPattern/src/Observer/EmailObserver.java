package Observer;

import Observable.IphoneObservable;

public class EmailObserver implements Observer {

    IphoneObservable iphoneObservable;

    public EmailObserver(IphoneObservable iphoneObservable){
        this.iphoneObservable = iphoneObservable;
    }

    @Override
    public void update() {
        System.out.println("Email sent, new stock count: " + iphoneObservable.getData());
    }
}
