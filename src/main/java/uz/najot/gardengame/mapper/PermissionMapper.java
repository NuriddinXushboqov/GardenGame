package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.PermissionDto;
import uz.najot.gardengame.model.Permission;

import java.util.List;
import java.util.Set;

@Component
public class PermissionMapper implements EntityMapper<PermissionDto, Permission>{
    @Override
    public Permission toEntity(PermissionDto dto) {
        return new Permission(dto.getName());
    }

    @Override
    public PermissionDto toDto(Permission entity) {
        return null;
    }

    @Override
    public List<Permission> toEntity(List<PermissionDto> dtoList) {
        return null;
    }

    @Override
    public List<PermissionDto> toDto(List<Permission> entityList) {
        return null;
    }

    @Override
    public Set<PermissionDto> toDto(Set<Permission> entityList) {
        return null;
    }
}
