package by.bntu.fitr.isit.lab2.factory.pattern.factory;

import by.bntu.fitr.isit.lab2.factory.pattern.model.CheesePizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.PepperoniPizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;
import by.bntu.fitr.isit.lab2.factory.pattern.model.VeggiePizza;

import java.util.HashMap;
import java.util.Map;

public class SimplePizzaFactory implements PizzaFactory {

    private Map<String, Pizza> pizzaMap = new HashMap<String, Pizza>() {
        {
            put("CheesePizza", new CheesePizza("Chees From Simple", "flour", "chili", "coca-cola", "fri"));
            put("PepperoniPizza", new PepperoniPizza("Pepperoni from Simple", "flour", "red hot chili"));
            put("VeggiePizza", new VeggiePizza("Veggie for family", "flour", "Chili paper", "Mr.Dima", 30.0));
        }
    };

    @Override
    public Pizza createPizza(String type) {
        return pizzaMap.get(type);
    }
}
