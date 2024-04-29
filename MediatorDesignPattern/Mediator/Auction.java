package MediatorDesignPattern.Mediator;

import MediatorDesignPattern.Colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> collegues = new ArrayList<>();

    public void addBidder(Colleague bidder){
        collegues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {

        for(Colleague colleague : collegues){

            if(!colleague.getName().equals(bidder.getName())){
                colleague.recieveBidNotification(bidAmount);
            }
        }
    }
}
