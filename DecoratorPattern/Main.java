package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.Margherita;

public class Main {

    public static void main(String[] args){

//        BasePizza pizza = new ExtraCheese(new Margherita());
//        int cost = pizza.cost();
//        System.out.println(cost);

        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        int cost = pizza.cost();
        System.out.println(cost);
    }
}
