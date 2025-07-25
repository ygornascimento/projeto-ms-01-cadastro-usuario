package com.example.cadastrousuario.api.request;

import com.example.cadastrousuario.infrastructure.entity.EnderecoEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class UsuarioRequestDTO {
    private String nome;
    private String email;
    private String documento;
    private EnderecoRequestDTO endereco;
}
