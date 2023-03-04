package uz.najot.gardengame.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.gardengame.dto.AppUserDto;
import uz.najot.gardengame.mapper.AppUserMapper;
import uz.najot.gardengame.message.ResMessage;
import uz.najot.gardengame.model.AppUser;
import uz.najot.gardengame.repository.AppUserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;
    private final AppUserMapper appUserMapper;

    public ResMessage getAll() {
        return ResMessage.getSuccess(appUserRepository.findAll());
    }

    public ResMessage getById(Integer id) {
        Optional<AppUser> user = appUserRepository.findById(id);
        if (user.isPresent()){
            return ResMessage.getSuccess(user);
        }
        return new ResMessage(101, "Not found", null);
    }

    public ResMessage create(AppUserDto appUserDto) {
        if (appUserDto.getId() == null) {
            AppUser appUser = appUserMapper.toEntity(appUserDto);
            AppUser save = appUserRepository.save(appUser);
            return ResMessage.getSuccess(save);
        } else {

        }

        return null;
    }


    public ResMessage remove(Integer id) {
        appUserRepository.deleteById(id);
        return null;
    }
}
