import DP.Composite.ProPackage;
import DP.Composite.Product;

import java.util.ArrayList;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product p4 = new Product("ramen", 3);
        Box smallBox = new Box("SmallBox");
        smallBox.add(p4);

        Product p3 = new Product("scrubDaddy", 7);
        Box mediumBox = new Box("MediumBox");
        mediumBox.add(p3);
        mediumBox.add(smallBox);
    }
}