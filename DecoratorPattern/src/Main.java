import BasePizzas.BasePizza;
import BasePizzas.FarmHouse;
import BasePizzas.Margarita;
import Toppings.ExtraCheese;
import Toppings.Jalapeno;
import Toppings.Mushroom;
import Toppings.Olive;

public class Main {
    public static void main(String[] args) {
        BasePizza p1 = new ExtraCheese(new Jalapeno(new Margarita()));
        BasePizza p2 = new Mushroom(new ExtraCheese(new FarmHouse()));
        BasePizza p3 = new ExtraCheese(new Mushroom(new Olive(new ExtraCheese(new FarmHouse()))));

        System.out.println(p1.cost());
        System.out.println(p2.cost());
        System.out.println(p3.cost());
    }
}