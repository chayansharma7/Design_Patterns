package BridgeDesignPattern;

import BridgeDesignPattern.Abstraction.*;
import BridgeDesignPattern.Abstraction.LivingThings;
import BridgeDesignPattern.Implementor.*;

public class Client {
        public static void main(String[] args) {

            LivingThings fishObject = new Fish(new WaterBreatheImplementor());
            fishObject.breatheProcess();
            LivingThings dogObject = new Dog(new LandBreatheImplementor());
            dogObject.breatheProcess();
            LivingThings treeObject = new Tree(new TreeBreatheImplementor());
            treeObject.breatheProcess();
    }
}
