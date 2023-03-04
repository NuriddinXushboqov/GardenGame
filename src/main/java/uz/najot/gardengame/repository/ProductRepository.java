package uz.najot.gardengame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
