package uz.najot.gardengame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Permission extends BasicModel implements GrantedAuthority {
    @Column(unique = true, nullable = false)
    private String name = "read";

    @Override
    public String getAuthority() {
        return this.name.toLowerCase();
    }
}
