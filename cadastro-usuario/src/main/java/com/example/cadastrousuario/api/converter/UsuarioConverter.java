package com.example.cadastrousuario.api.converter;

import com.example.cadastrousuario.api.request.EnderecoRequestDTO;
import com.example.cadastrousuario.api.request.UsuarioRequestDTO;
import com.example.cadastrousuario.api.response.EnderecoResponseDTO;
import com.example.cadastrousuario.api.response.UsuarioResponseDTO;
import com.example.cadastrousuario.infrastructure.entity.EnderecoEntity;
import com.example.cadastrousuario.infrastructure.entity.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UsuarioConverter {
    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO) {
        return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .endereco(paraEnderecoEntity(usuarioDTO.getEndereco()))
                .build();

    }

    private EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoRequestDTO) {
        return EnderecoEntity.builder()
                .rua(enderecoRequestDTO.getRua())
                .bairro(enderecoRequestDTO.getBairro())
                .cep(enderecoRequestDTO.getCep())
                .cidade(enderecoRequestDTO.getCidade())
                .numero(enderecoRequestDTO.getNumero())
                .complemento(enderecoRequestDTO.getComplemento())
                .build();
    }

    public UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity usuarioEntity) {
        return UsuarioResponseDTO.builder()
                .id(usuarioEntity.getId())
                .nome(usuarioEntity.getNome())
                .documento(usuarioEntity.getDocumento())
                .email(usuarioEntity.getEmail())
                .endereco(paraEnderecoResponseDTO(usuarioEntity.getEndereco()))
                .build();

    }

    private EnderecoResponseDTO paraEnderecoResponseDTO(EnderecoEntity enderecoEntity) {
        return EnderecoResponseDTO.builder()
                .rua(enderecoEntity.getRua())
                .bairro(enderecoEntity.getBairro())
                .cep(enderecoEntity.getCep())
                .cidade(enderecoEntity.getCidade())
                .numero(enderecoEntity.getNumero())
                .complemento(enderecoEntity.getComplemento())
                .build();
    }
}
