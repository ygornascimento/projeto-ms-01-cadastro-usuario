package com.example.cadastrousuario.business;

import com.example.cadastrousuario.api.converter.UsuarioConverter;
import com.example.cadastrousuario.api.request.UsuarioRequestDTO;
import com.example.cadastrousuario.api.response.UsuarioResponseDTO;
import com.example.cadastrousuario.infrastructure.entity.UsuarioEntity;
import com.example.cadastrousuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioEntity salvarUsuario(UsuarioEntity usuarioEntity) {
        return usuarioRepository.saveAndFlush(usuarioEntity);
    }

    public UsuarioResponseDTO gravarUsuario(UsuarioRequestDTO usuarioRequestDTO) {
        try {
            UsuarioEntity usuarioEntity = salvarUsuario(usuarioConverter.paraUsuarioEntity(usuarioRequestDTO));
            return usuarioConverter.paraUsuarioResponseDTO(usuarioEntity);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gravar dados de usuário.");
        }
    }

    public UsuarioResponseDTO buscarDadosUsuario(String email) {
        return  usuarioConverter.paraUsuarioResponseDTO(usuarioRepository.findByEmail(email));
    }

    public void deletaDadosUsuario(String email) {
        usuarioRepository.deleteByEmail(email);
    }

}
