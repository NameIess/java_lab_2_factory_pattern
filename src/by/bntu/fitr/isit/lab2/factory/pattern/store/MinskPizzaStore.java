package by.bntu.fitr.isit.lab2.factory.pattern.store;

import by.bntu.fitr.isit.lab2.factory.pattern.factory.PizzaFactory;
import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;

public class MinskPizzaStore extends PizzaStore {

    private PizzaFactory pizzaFactory;

    public MinskPizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    @Override
    Pizza createLocalPizza(String pizzaType) {
        return pizzaFactory.createPizza(pizzaType);
    }
}

