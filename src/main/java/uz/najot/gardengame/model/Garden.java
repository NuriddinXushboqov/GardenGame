package uz.najot.gardengame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Garden extends BasicModel{
    private String name;
    @OneToOne
    private Inventory inventory;

    public Garden(String name) {
        this.name = name;
    }
}
