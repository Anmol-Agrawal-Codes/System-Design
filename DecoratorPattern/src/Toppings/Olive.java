package Toppings;

import BasePizzas.BasePizza;

public class Olive extends ToppingsDecorator{

    public Olive(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int cost(){
        return super.cost() + 10;
    }
}
