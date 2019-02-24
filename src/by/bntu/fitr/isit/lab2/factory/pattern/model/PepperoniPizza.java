package by.bntu.fitr.isit.lab2.factory.pattern.model;

public class PepperoniPizza extends Pizza {



    public PepperoniPizza(String name, String dough, String sauce) {
        this.setName(name);
        this.setDough(dough);
        this.setSauce(sauce);
    }


    @Override
    public void box() {
        System.out.println("Special box for PepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 15 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into horizontal slices");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        System.out.println("Tossing dough" + getDough());
        System.out.println("Adding sauce" + getSauce());
    }


}
