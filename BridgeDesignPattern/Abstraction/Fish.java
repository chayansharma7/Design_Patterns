package BridgeDesignPattern.Abstraction;

import BridgeDesignPattern.Implementor.BreatheImplementor;

public class Fish extends LivingThings{

    public Fish(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    public void breatheProcess(){

        breatheImplementor.breathe();
    }
}
