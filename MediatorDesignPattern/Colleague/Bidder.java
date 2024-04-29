package MediatorDesignPattern.Colleague;

import MediatorDesignPattern.Mediator.AuctionMediator;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    public void placeBid(int bidAmount){
        auctionMediator.placeBid(this, bidAmount);
    }

    public void recieveBidNotification(int bidAmount){
        System.out.println("Bidder: " +name+ " got the notification that someone has put the bid of "+bidAmount);
    }

    public String getName(){
        return name;
    }
}

