package MediatorDesignPattern;

import MediatorDesignPattern.Colleague.Bidder;
import MediatorDesignPattern.Colleague.Colleague;
import MediatorDesignPattern.Mediator.Auction;
import MediatorDesignPattern.Mediator.AuctionMediator;

public class Driver {
    public static void main(String[] args) {

        AuctionMediator auctionMediatorObj = new Auction();
        Colleague bidder1 = new Bidder("Chayan", auctionMediatorObj);
        Colleague bidder2 = new Bidder("Rahul", auctionMediatorObj);

        bidder1.placeBid(1000);
        bidder2.placeBid(2000);
        bidder1.placeBid(3000);
    }
}
