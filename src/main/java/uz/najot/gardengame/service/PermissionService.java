package uz.najot.gardengame.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.najot.gardengame.dto.PermissionDto;
import uz.najot.gardengame.mapper.PermissionMapper;
import uz.najot.gardengame.message.ResMessage;
import uz.najot.gardengame.model.Permission;
import uz.najot.gardengame.repository.PermissionRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PermissionService {

    private final PermissionMapper permissionMapper;
    private final PermissionRepository permissionRepository;

    public ResMessage getAll() {
        List<Permission> all = permissionRepository.findAll();
        return ResMessage.getSuccess(all);
    }

    public ResMessage getById(Integer id) {
        Optional<Permission> permission = permissionRepository.findById(id);
        if (permission.isPresent()){
            return ResMessage.getSuccess(permission);
        }
        return new ResMessage(102, "Not found", null);
    }

    public ResMessage create(PermissionDto permissionDto) {
        if (permissionDto.getId() == null) {
            Permission permission = permissionMapper.toEntity(permissionDto);
            Permission save = permissionRepository.save(permission);
            return ResMessage.getSuccess(save);
        }else {
            Optional<Permission> byId = permissionRepository.findById(permissionDto.getId());
            if (byId.isPresent()){
                byId.get().setName(permissionDto.getName());
                Permission save = permissionRepository.save(byId.get());
                return new ResMessage(0, "Saved", save);
            }else {
                return new ResMessage(104, "Not updated", null);
            }
//            return new ResMessage(105, "Not saved", null);
        }
    }

    public ResMessage remove(Integer id) {
        Optional<Permission> byId = permissionRepository.findById(id);
        if (byId.isPresent()){
            byId.get().setIsActive(false);
            Permission save = permissionRepository.save(byId.get());
            return new ResMessage(0, "Deleted", null);
        }
        return new ResMessage(103, "Not deleted", null);
    }
}
