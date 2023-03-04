package uz.najot.gardengame.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Photo extends BasicModel{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Byte[] content;
    @Column(nullable = false)
    private String contentType;
    @Column(nullable = false)
    private String photoUrl;

    
}
