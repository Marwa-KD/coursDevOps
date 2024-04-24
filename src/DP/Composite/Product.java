package DP.Composite;

public class Product extends ProPackage{
    public Product(String name, double price) {
        super(name);
        this.price=price;
    }
    public double CalculatePrice(){
        return price;
    }
}
