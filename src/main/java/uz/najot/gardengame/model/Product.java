package uz.najot.gardengame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.najot.gardengame.model.enums.ProductEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BasicModel {
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private Double price;
    private ProductEnum type = ProductEnum.BEAN;
    @Column(nullable = false)
    private Integer ripingTime;
    @Column(nullable = false)
    private Integer sellTime;
    @OneToOne
    private Photo photo;

    public Integer getRipingTime() {
        return ripingTime*1000;
    }

    public Integer getSellTime() {
        return sellTime*1000;
    }

    public Product(String name, Double price, Integer ripingTime, Integer sellTime) {
        this.name = name;
        this.price = price;
        this.ripingTime = ripingTime;
        this.sellTime = sellTime;
    }
}
