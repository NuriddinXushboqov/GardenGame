package uz.najot.gardengame.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser extends BasicModel implements UserDetails {
    private String name = "Garden";
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    private Double balance = 1000d;
    @ManyToOne
    private Role role;
    @OneToOne
    private Photo photo;
    @OneToOne
    private Inventory inventory;
    @OneToOne
    private Garden garden;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.role.getPermissionList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
