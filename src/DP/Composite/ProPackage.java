package DP.Composite;

public abstract class ProPackage {

    protected String name;
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProPackage(String name) {
        this.name = name;
    }
    public abstract double CalculatePrice();
}
