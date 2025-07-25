package com.example.cadastrousuario.infrastructure.repository;

import com.example.cadastrousuario.infrastructure.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
