package by.bntu.fitr.isit.lab2.factory.pattern.model;

public class CheesePizza extends Pizza {

    private String soda;
    private String potato;

    public CheesePizza(String name, String dough, String sauce, String soda, String potato) {
        this.setName(name);
        this.setDough(dough);
        this.setSauce(sauce);
        this.potato = potato;
        this.soda = soda;
    }


    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
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
