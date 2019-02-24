package by.bntu.fitr.isit.lab2.factory.pattern.factory;

import by.bntu.fitr.isit.lab2.factory.pattern.model.CheesePizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.PepperoniPizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.VeggiePizza;

import java.util.HashMap;
import java.util.Map;

public class MinskPizzaFactory implements PizzaFactory {

    private Map<String, Pizza> pizzaMap = new HashMap<String, Pizza>() {
        {
            put("CheesePizza from Minsk", new CheesePizza("Chees From Minsk", "flour", "Barbeku", "sprite", "fri"));
            put("PepperoniPizza from Minsk", new PepperoniPizza("Pepperoni from Minsk", "flour", "Chees"));
            put("VeggiePizza", new VeggiePizza("Veggie for family from Minsk", "flour with eggs", "paprika", "Mr.Sasha", 20.0));
        }
    };

    @Override
    public Pizza createPizza(String type) {
        return pizzaMap.get(type);
    }
}
