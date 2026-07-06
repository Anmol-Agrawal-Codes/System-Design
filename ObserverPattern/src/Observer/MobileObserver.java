package Observer;

import Observable.IphoneObservable;

public class MobileObserver implements Observer {

    IphoneObservable iphoneObservable;

    public MobileObserver(IphoneObservable iphoneObservable) {
        this.iphoneObservable = iphoneObservable;
    }

    @Override
    public void update() {
        System.out.println("SMS sent, new stock count: " + iphoneObservable.getData());
    }
}
