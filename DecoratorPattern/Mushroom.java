package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    // BasePizza basePizza; == HAS-A relationship
    BasePizza basePizza;

    public Mushroom(BasePizza pizza){

        this.basePizza = pizza;
    }

    @Override
    public int cost() {

        return this.basePizza.cost() + 15;
    }
}
