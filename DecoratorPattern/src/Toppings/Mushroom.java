package Toppings;

import BasePizzas.BasePizza;

public class Mushroom extends ToppingsDecorator {

    public Mushroom(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int cost(){
        return super.cost() + 20;
    }
}
