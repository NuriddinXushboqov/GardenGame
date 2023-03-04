package uz.najot.gardengame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BasicModel {
    @Column(nullable = false, unique = true)
    private String name = "USER";
    @ManyToMany
    private List<Permission> permissionList = List.of( new Permission());

    public List<Permission> getPermissionList() {
        permissionList.add(new Permission("ROLE_"+this.name.toUpperCase()));
        return permissionList;
    }

    public Role(String name) {
        this.name = name;
    }
}
