package Observable;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{

    List<Observer> observers;
    int stockCount;

    public IphoneObservable(){
        observers = new ArrayList<>();
        stockCount = 0;
    }

    @Override
    public void add(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public void setData(int newStock) {
        if(stockCount == 0){
            stockCount += newStock;
            notifySubscribers();
        }
        else {
            stockCount += newStock;
        }
    }

    @Override
    public int getData(){
        return stockCount;
    }
}
