package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.GardenDto;
import uz.najot.gardengame.model.Garden;

import java.util.List;
import java.util.Set;

@Component
public class GardenMapper implements EntityMapper<GardenDto, Garden> {
    @Override
    public Garden toEntity(GardenDto dto) {
        return new Garden(dto.getName());
    }

    @Override
    public GardenDto toDto(Garden entity) {
        return null;
    }

    @Override
    public List<Garden> toEntity(List<GardenDto> dtoList) {
        return null;
    }

    @Override
    public List<GardenDto> toDto(List<Garden> entityList) {
        return null;
    }

    @Override
    public Set<GardenDto> toDto(Set<Garden> entityList) {
        return null;
    }
}
