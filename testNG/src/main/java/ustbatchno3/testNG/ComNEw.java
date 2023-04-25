package ustbatchno3.testNG;

  
    import java.util.Arrays;
import java.util.List;

public class ComNEw {
    private String nameOfCity;
    private double priceWithMaterial;
    private double priceWithoutMaterial;

    public ComNEw(String nameOfCity, double priceWithMaterial, double priceWithoutMaterial) {
        this.nameOfCity = nameOfCity;
        this.priceWithMaterial = priceWithMaterial;
        this.priceWithoutMaterial = priceWithoutMaterial;
    }
    public String getNameOfCity() {
        return nameOfCity;
    }
    public double getPriceWithMaterial() {
        return priceWithMaterial;
    }

    public double getPriceWithoutMaterial() {
        return priceWithoutMaterial;
    }
    public List<Double> getThePriceOnSquareFeet(double squareFeet) {
        double priceWithM = squareFeet * getPriceWithMaterial();
        double priceWithoutM = squareFeet * getPriceWithoutMaterial();
        return Arrays.asList(priceWithM, priceWithoutM);
    }
}