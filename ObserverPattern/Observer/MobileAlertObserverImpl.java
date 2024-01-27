package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;
public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){

        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {

        sendMsgOnMobile(emailId, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg){

        System.out.println("msg sent to : "+userName);
        System.out.println(msg);
    }
}
