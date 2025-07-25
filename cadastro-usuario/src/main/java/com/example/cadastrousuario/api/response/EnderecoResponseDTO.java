package com.example.cadastrousuario.api.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoResponseDTO {
    private Long id;
    private String rua;
    private Long numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String cep;
}
