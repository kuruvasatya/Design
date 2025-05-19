package observer.notifyme.products;

import observer.notifyme.notification.Observer;

public interface ItemObservable {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void sendNotification();
    void stockRefill(int quantity);
}
