package uz.najot.gardengame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.najot.gardengame.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {


}
