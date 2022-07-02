package com.example.augusto.api.repositories;

import com.example.augusto.api.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {
}
