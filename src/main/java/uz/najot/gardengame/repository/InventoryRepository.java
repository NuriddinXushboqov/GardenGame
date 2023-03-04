package uz.najot.gardengame.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Inventory> {
}
