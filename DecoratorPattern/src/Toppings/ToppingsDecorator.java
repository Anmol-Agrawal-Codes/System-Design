package Toppings;

import BasePizzas.BasePizza;

public abstract class ToppingsDecorator implements BasePizza {

    BasePizza pizza;

    public ToppingsDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost();
    }
}
