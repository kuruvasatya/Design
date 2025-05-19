package observer.notifyme.notification;

import observer.notifyme.products.ItemObservable;

public class WhatsappNotification implements Observer {
    private final long phoneNumber;
    private final ItemObservable itemObservable;

    public WhatsappNotification(long phoneNumber, ItemObservable itemObservable) {
        itemObservable.subscribe(this);
        this.phoneNumber = phoneNumber;
        this.itemObservable = itemObservable;
    }

    @Override
    public void sendNotification() {
        System.out.println(itemObservable.getClass().getSimpleName() + " stock refilled! hurry up " + this.phoneNumber);
    }
}
