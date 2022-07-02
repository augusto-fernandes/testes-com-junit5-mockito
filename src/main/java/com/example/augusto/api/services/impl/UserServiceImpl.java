package com.example.augusto.api.services.impl;

import com.example.augusto.api.domain.Usuario;
import com.example.augusto.api.repositories.UserRepository;
import com.example.augusto.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
