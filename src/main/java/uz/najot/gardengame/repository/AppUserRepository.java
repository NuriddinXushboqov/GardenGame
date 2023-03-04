package uz.najot.gardengame.repository;

import org.hibernate.hql.internal.ast.tree.IdentNode;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
