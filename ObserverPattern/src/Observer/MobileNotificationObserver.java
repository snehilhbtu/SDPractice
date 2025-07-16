package Observer;

import Observable.StockObservable;

public class MobileNotificationObserver implements NotificationObserver{

    StockObservable observable;

    public MobileNotificationObserver(StockObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    String emailId;



    @Override
    public void update() {
        sendMessage(emailId,"Hurry up stock is available");
    }

    public void sendMessage(String emailId,String message){
        System.out.println("Email sent to "+emailId);
    }

}
