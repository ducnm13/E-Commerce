package model.mapper;

import model.UserModel;
import model.dto.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

    public UserDTO toUserDTO(UserModel userModel) {
        UserDTO dto = new UserDTO()
                .setId(userModel.getId())
                .setUsername(userModel.getUsername());
        return dto;
    }
    
}
