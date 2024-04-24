import DP.Composite.ProPackage;

import java.util.ArrayList;
import java.util.List;
public class Box extends ProPackage {
    List<ProPackage> packages = new ArrayList<>();
    public Box(String name) {
        super(name);
    }

    public void add(ProPackage item) {
        packages.add(item);
    }

    public void remove(ProPackage item) {
        packages.remove(item);
    }
    public double CalculatePrice(){
        double cost=0;
        for(ProPackage elt:packages){
            cost=elt.CalculatePrice();
        }
        return cost;
    }
}
