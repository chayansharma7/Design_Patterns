package BridgeDesignPattern.Abstraction;

import BridgeDesignPattern.Implementor.BreatheImplementor;

public class Tree extends LivingThings{

    public Tree(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    public void breatheProcess(){
        breatheImplementor.breathe();
    }
}
