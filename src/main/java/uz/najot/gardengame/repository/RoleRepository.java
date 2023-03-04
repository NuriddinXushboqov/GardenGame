package uz.najot.gardengame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
