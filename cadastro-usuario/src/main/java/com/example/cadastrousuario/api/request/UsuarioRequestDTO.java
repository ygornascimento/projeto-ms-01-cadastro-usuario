package com.example.cadastrousuario.api.request;

import com.example.cadastrousuario.infrastructure.entity.EnderecoEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioRequestDTO {
    private Long id;
    private String nome;
    private String email;
    private String documento;
    private EnderecoRequestDTO enderco;
}
