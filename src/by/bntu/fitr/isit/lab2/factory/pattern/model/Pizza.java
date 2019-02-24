package by.bntu.fitr.isit.lab2.factory.pattern.model;

public abstract class Pizza {

    private String name;
    private String sauce;
    private String dough;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }


    public void bake() {
        System.out.println("Bake for 25 minutes");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slice");
    }

    public void box() {
        System.out.println("Place pizza into official PizzaStore box");
    }

    public void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding sauce" + sauce);
    }

}


