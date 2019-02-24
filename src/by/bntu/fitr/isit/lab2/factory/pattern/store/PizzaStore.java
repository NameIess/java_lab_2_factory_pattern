package by.bntu.fitr.isit.lab2.factory.pattern.store;

import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;

public abstract class PizzaStore extends Pizza {

    public Pizza orderPizza(String pizzaType) {

        Pizza pizza = createLocalPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createLocalPizza(String pizzaType);

}
