package by.bntu.fitr.isit.lab2.factory.pattern.factory;

import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;

public interface PizzaFactory {

    Pizza createPizza(String type);

}
