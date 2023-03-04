package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.RoleDto;
import uz.najot.gardengame.model.Role;

import java.util.List;
import java.util.Set;

@Component
public class RoleMapper implements EntityMapper<RoleDto, Role>{
    @Override
    public Role toEntity(RoleDto dto) {
        return new Role(dto.getName());
    }

    @Override
    public RoleDto toDto(Role entity) {
        return null;
    }

    @Override
    public List<Role> toEntity(List<RoleDto> dtoList) {
        return null;
    }

    @Override
    public List<RoleDto> toDto(List<Role> entityList) {
        return null;
    }

    @Override
    public Set<RoleDto> toDto(Set<Role> entityList) {
        return null;
    }
}
