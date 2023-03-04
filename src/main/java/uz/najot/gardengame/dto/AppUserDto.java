package uz.najot.gardengame.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDto {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String email;
}
