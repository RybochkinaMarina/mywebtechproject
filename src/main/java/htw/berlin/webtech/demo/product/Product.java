package htw.berlin.webtech.demo.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Product {

    private String name;

    private int kcal;

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
