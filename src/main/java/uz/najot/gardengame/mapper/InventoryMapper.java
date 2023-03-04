package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.InventoryDto;
import uz.najot.gardengame.model.Inventory;

import java.util.List;
import java.util.Set;

@Component
public class InventoryMapper implements EntityMapper<InventoryDto, Inventory>{
    @Override
    public Inventory toEntity(InventoryDto dto) {
        return new Inventory();
    }

    @Override
    public InventoryDto toDto(Inventory entity) {
        return null;
    }

    @Override
    public List<Inventory> toEntity(List<InventoryDto> dtoList) {
        return null;
    }

    @Override
    public List<InventoryDto> toDto(List<Inventory> entityList) {
        return null;
    }

    @Override
    public Set<InventoryDto> toDto(Set<Inventory> entityList) {
        return null;
    }
}
