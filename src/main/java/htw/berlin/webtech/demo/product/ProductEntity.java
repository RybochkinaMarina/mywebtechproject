package htw.berlin.webtech.demo.product;


import htw.berlin.webtech.demo.day.DayEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Product")
public class ProductEntity {

    private String name;

    private int kcal;

    @ManyToMany(mappedBy = "productEntitySet")
    private List<DayEntity> dayEntitySet = new ArrayList<>();

    private Long id;

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
