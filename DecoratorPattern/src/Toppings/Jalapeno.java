package Toppings;

import BasePizzas.BasePizza;

public class Jalapeno extends ToppingsDecorator {

    public Jalapeno(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int cost(){
        return super.cost() + 15;
    }
}
