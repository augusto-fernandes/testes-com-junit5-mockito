package com.example.augusto.api.services;

import com.example.augusto.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
