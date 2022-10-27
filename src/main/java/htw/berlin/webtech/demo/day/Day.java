package htw.berlin.webtech.demo.day;

import htw.berlin.webtech.demo.product.ProductEntity;
import htw.berlin.webtech.demo.user.User;
import org.jetbrains.annotations.NotNull;
import java.util.List;


public class Day {

    private long id;

    private String date;

    private List<ProductEntity> products;

    private int dailyKcal;

    private int kcal;



    public Day(@NotNull User user, String date, List<ProductEntity> products) {
        this.date = date;
        this.products = products;
        this.dailyKcal = user.getBmr();
        this.kcal = calcKcal();
    }

    public int calcKcal() {
        int kcalFromProd = 0;

        for (ProductEntity pr : products) {
            kcalFromProd = kcalFromProd + pr.getKcal();
        }

        return kcalFromProd;
    }

    public int getDailyKcal() {
        return dailyKcal;
    }

    public void setDailyKcal(int dailyKcal) {
        this.dailyKcal = dailyKcal;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
}
