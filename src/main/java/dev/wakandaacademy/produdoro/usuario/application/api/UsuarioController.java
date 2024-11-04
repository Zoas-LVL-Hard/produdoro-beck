package dev.wakandaacademy.produdoro.usuario.application.api;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Validated
@Log4j2
@RequiredArgsConstructor    //TODO Ele cria um construtor para tudo que está como final gerenciando esse construtor.
public class UsuarioController implements UsuarioAPI {
    
    private final UsuarioApplicationService usuarioApplicationService;
    
        @Override
        public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo){
            log.info("[start] UsuarioController - postNovoUsuario");
            UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
            log.info("[finish] UsuarioController - postNovoUsuario");
            return usuarioCriado;
    }

}
