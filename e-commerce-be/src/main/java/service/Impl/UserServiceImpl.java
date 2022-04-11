package service.Impl;

import model.ResponseModel;
import model.UserModel;
import model.dto.UserDTO;
import model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public ResponseModel getUsers() {
        Map<String, Object> response = new HashMap<>();
        List<UserModel> users = userRepository.findAll();
        List<UserDTO> usersReponse = users.stream().map(user -> userMapper.toUserDTO(user)).collect(Collectors.toList());
        response.put("data", usersReponse);
        return new ResponseModel(200, "SUCCESS", response);
    }

}
