package htw.berlin.webtech.demo.day;

import htw.berlin.webtech.demo.product.Product;

import java.util.List;


public class Day {

    private List<Product> products;

    private int dailyKcal;

    private int kcal;

    public int calcKcal() {
        int kcalFromProd = 0;

        for (Product pr : products) {
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
}
