package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;
public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){

        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {

        sendMail(emailId, "Product is in stock hurry up!");
    }

    // sendMail is dummy method
    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to : "+emailId);
        System.out.println(msg);
    }
}

