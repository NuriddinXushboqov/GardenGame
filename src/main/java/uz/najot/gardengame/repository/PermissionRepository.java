package uz.najot.gardengame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
