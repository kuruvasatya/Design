package observer.notifyme.products;

import observer.notifyme.notification.Observer;

import java.util.ArrayList;
import java.util.List;

public class Samsung implements ItemObservable{
    private List<Observer> observers;
    private int stockCount;

    public Samsung() {
        observers = new ArrayList<>();
        stockCount = 0;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendNotification() {
        observers.forEach(Observer::sendNotification);
    }

    @Override
    public void stockRefill(int quantity) {
        stockCount += quantity;
        sendNotification();
    }
}
