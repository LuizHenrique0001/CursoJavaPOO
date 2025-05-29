package Entity;

public class Product {

    private String name;
    private Double prince;

    public Product(String name, Double prince) {
        this.name = name;
        this.prince = prince;
    }

    public String getName() {
        return name;
    }

    public Double getPrince() {
        return prince;
    }


}
