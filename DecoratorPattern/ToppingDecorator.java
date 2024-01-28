package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;

// extends = IS-A relationship
public abstract class ToppingDecorator extends BasePizza {

    public abstract int cost();
}
