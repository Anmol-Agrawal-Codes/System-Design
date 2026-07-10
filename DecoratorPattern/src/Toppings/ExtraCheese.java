package Toppings;

import BasePizzas.BasePizza;

public class ExtraCheese extends ToppingsDecorator {

    public ExtraCheese(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int cost(){
        return super.cost() + 25;
    }
}
