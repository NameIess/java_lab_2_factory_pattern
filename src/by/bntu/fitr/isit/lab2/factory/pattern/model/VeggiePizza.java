package by.bntu.fitr.isit.lab2.factory.pattern.model;

public class VeggiePizza extends Pizza {

    private String chef;
    private double size;

    public VeggiePizza(String name, String dough, String sauce, String chef, double size) {
        this.setName(name);
        this.setDough(dough);
        this.setSauce(sauce);
        this.chef = chef;
        this.size = size;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void box() {
        System.out.println("Special box for VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into 5 diagonal slices");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing" + getName());
        System.out.println("Tossing dough" + getDough());
        System.out.println("Adding sauce" + getSauce());
    }

}
