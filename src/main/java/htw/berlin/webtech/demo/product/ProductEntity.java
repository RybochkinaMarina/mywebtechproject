package htw.berlin.webtech.demo.product;


import htw.berlin.webtech.demo.day.DayEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "Produkt_Name", nullable = false)
    private String name;

    @Column(name = "Kcal", nullable = false)
    private int kcal;

    public ProductEntity(String name, int kcal){
        this.name = name;
        this.kcal = kcal;
    }

    protected ProductEntity(){

    }

    @ManyToMany(mappedBy = "productEntitySet")
    private List<DayEntity> dayEntitySet = new ArrayList<>();

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

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
