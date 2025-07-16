package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MobileStockObservable implements StockObservable{

    public MobileStockObservable(int currentStock) {
        this.currentStock = currentStock;
    }

    List<NotificationObserver> observerList=new ArrayList<>();
    int currentStock;

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyall() {
        for(NotificationObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void updateCount(int addedStock) {
        if(currentStock==0){
            notifyall();
        }

        currentStock+=addedStock;

    }

    @Override
    public int getCount() {
        return currentStock;
    }
}
