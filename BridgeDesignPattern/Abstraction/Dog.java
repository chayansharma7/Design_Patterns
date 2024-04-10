package BridgeDesignPattern.Abstraction;

import BridgeDesignPattern.Implementor.BreatheImplementor;

public class Dog extends LivingThings{

    public Dog(BreatheImplementor breatheImplementor){

        super(breatheImplementor);
    }

    public void breatheProcess(){

        breatheImplementor.breathe();
    }
}
