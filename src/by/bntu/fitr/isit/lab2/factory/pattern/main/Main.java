package by.bntu.fitr.isit.lab2.factory.pattern.main;

import by.bntu.fitr.isit.lab2.factory.pattern.factory.MinskPizzaFactory;
import by.bntu.fitr.isit.lab2.factory.pattern.factory.PizzaFactory;
import by.bntu.fitr.isit.lab2.factory.pattern.factory.SimplePizzaFactory;
import by.bntu.fitr.isit.lab2.factory.pattern.model.Pizza;
import by.bntu.fitr.isit.lab2.factory.pattern.store.MinskPizzaStore;
import by.bntu.fitr.isit.lab2.factory.pattern.store.PizzaStore;
import by.bntu.fitr.isit.lab2.factory.pattern.store.SimplePizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaFactory minsPizzaFactory = new MinskPizzaFactory();
        PizzaStore minskPizzaStore = new MinskPizzaStore(minsPizzaFactory);

        minskPizzaStore.orderPizza("PepperoniPizza from Minsk");

        PizzaFactory simplPizzaFactory = new SimplePizzaFactory();
        PizzaStore simplPizzaStore = new SimplePizzaStore(simplPizzaFactory);

        Pizza pizzaBySimpl = simplPizzaStore.orderPizza("PepperoniPizza");

    }
}
