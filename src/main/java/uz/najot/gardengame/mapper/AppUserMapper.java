package uz.najot.gardengame.mapper;

import org.springframework.stereotype.Component;
import uz.najot.gardengame.dto.AppUserDto;
import uz.najot.gardengame.model.AppUser;

import java.util.List;
import java.util.Set;

@Component
public class AppUserMapper implements EntityMapper<AppUserDto, AppUser> {

    @Override
    public AppUser toEntity(AppUserDto dto) {
        AppUser appUser = new AppUser();
        appUser.setId(dto.getId());
        appUser.setName(dto.getName());
        appUser.setUsername(dto.getUsername());
        appUser.setPassword(dto.getPassword());
        appUser.setEmail(dto.getEmail());

        return appUser;
    }

    @Override
    public AppUserDto toDto(AppUser entity) {
        return null;
    }

    @Override
    public List<AppUser> toEntity(List<AppUserDto> dtoList) {
        return null;
    }

    @Override
    public List<AppUserDto> toDto(List<AppUser> entityList) {
        return null;
    }

    @Override
    public Set<AppUserDto> toDto(Set<AppUser> entityList) {
        return null;
    }
}
