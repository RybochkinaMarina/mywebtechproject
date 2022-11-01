package htw.berlin.webtech.demo.product;

public class Product {

    private long id;
    private String name;
    private int kcal;

    public Product(long id, String name, int kcal) {
        this.id = id;
        this.name = name;
        this.kcal = kcal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
