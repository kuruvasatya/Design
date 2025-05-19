package observer.notifyme.products;


import observer.notifyme.notification.Observer;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ItemObservable {
    private int stockCount;
    private final List<Observer> observers;

    public Iphone() {
        this.stockCount = 0;
        this.observers = new ArrayList<>();
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
        this.stockCount += quantity;
        sendNotification();
    }
}
