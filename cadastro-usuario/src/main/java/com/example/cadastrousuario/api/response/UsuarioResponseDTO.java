package com.example.cadastrousuario.api.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String documento;
    private EnderecoResponseDTO endereco;
}
