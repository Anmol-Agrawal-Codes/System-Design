import Observable.IphoneObservable;
import Observer.EmailObserver;
import Observer.MobileObserver;
import Observer.Observer;

public class Main {
    public static void main(String[] args) {
        IphoneObservable iphone = new IphoneObservable();

        Observer observer1 = new EmailObserver(iphone);
        Observer observer2 = new EmailObserver(iphone);
        Observer observer3 = new MobileObserver(iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setData(10);
        iphone.setData(10);
    }
}