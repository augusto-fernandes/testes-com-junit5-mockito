package com.example.augusto.api.services;

import com.example.augusto.api.domain.User;
import com.example.augusto.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
