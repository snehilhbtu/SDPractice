package Observable;

import Observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifyall();
    public void updateCount(int addedStock);
    public int getCount();

}
