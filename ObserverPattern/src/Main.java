import Observable.MobileStockObservable;
import Observer.MobileNotificationObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MobileStockObservable mobileStockObservable=new MobileStockObservable(0);
        MobileStockObservable mobileStockObservable2=new MobileStockObservable(0);

        MobileNotificationObserver observer1=new MobileNotificationObserver(mobileStockObservable,"observer1@xyz.com");
        MobileNotificationObserver observer2=new MobileNotificationObserver(mobileStockObservable2,"observer2@xyz.com");
        MobileNotificationObserver observer3=new MobileNotificationObserver(mobileStockObservable,"observer3@xyz.com");

        mobileStockObservable.add(observer1);
        mobileStockObservable.add(observer3);
        mobileStockObservable2.add(observer2);

        mobileStockObservable.updateCount(10);
        mobileStockObservable2.updateCount(5);

    }
}