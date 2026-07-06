package Observable;

import Observer.Observer;

public interface Observable {

    void add(Observer obj);

    void remove(Observer obj);

    void notifySubscribers();

    void setData(int data);

    int getData();
}
