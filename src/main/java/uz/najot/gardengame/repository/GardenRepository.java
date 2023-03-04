package uz.najot.gardengame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Garden;

public interface GardenRepository extends JpaRepository<Garden, Integer> {
}
