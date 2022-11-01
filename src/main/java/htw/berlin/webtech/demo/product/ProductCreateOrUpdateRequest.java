package htw.berlin.webtech.demo.product;

public class ProductCreateOrUpdateRequest {

    public String name;
    public int kcal;

    public ProductCreateOrUpdateRequest(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
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
