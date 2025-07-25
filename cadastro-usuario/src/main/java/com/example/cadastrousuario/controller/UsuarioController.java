package com.example.cadastrousuario.controller;

import com.example.cadastrousuario.api.request.UsuarioRequestDTO;
import com.example.cadastrousuario.api.response.UsuarioResponseDTO;
import com.example.cadastrousuario.business.UsuarioService;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<UsuarioResponseDTO> gravarDadosUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return ResponseEntity.ok(usuarioService.gravarUsuario(usuarioRequestDTO));
    }

    @GetMapping()
    public ResponseEntity<UsuarioResponseDTO> buscarPorEmail(@RequestParam ("email") String email) {
        return ResponseEntity.ok(usuarioService.buscarDadosUsuario(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarDadosUsuario(@RequestParam ("email") String email) {
        usuarioService.deletaDadosUsuario(email);
        return ResponseEntity.accepted().build();
    }

}
