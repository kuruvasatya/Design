package observer.notifyme.notification;

import observer.notifyme.products.ItemObservable;

public class EmailNotification implements Observer {
    private final String emailId;
    private final ItemObservable itemObservable;

    public EmailNotification(String emailId, ItemObservable itemObservable) {
        this.emailId = emailId;
        this.itemObservable = itemObservable;
        itemObservable.subscribe(this);
    }

    @Override
    public void sendNotification() {
        System.out.println(itemObservable.getClass().getSimpleName() + " stock is refilled! hurry up " + emailId);
    }
}
