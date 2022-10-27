package htw.berlin.webtech.demo.day;


import htw.berlin.webtech.demo.product.ProductEntity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name= "Day")
public class DayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    @ManyToMany
    @JoinTable(name="product_aDay",
    joinColumns = @JoinColumn(name="day_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductEntity> productEntitySet = new ArrayList<>();

    private int dailyKcal;

    private int kcal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}