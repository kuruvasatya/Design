package observer.notifyme;

import observer.notifyme.notification.EmailNotification;
import observer.notifyme.notification.Observer;
import observer.notifyme.notification.WhatsappNotification;
import observer.notifyme.products.Iphone;
import observer.notifyme.products.Samsung;

class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        Observer observer1 = new EmailNotification("satya@gmail.com", iphone);
        Observer observer2 = new WhatsappNotification(91004, iphone);

        Observer observer3 = new EmailNotification("satya@gmail.com", samsung);

        iphone.stockRefill(15);
        samsung.stockRefill(20);

        iphone.unSubscribe(observer1);

        iphone.stockRefill(15);
    }
}
