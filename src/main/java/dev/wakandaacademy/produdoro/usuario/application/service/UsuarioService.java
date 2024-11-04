package dev.wakandaacademy.produdoro.usuario.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.credencial.application.service.CredencialApplicationService;
import dev.wakandaacademy.produdoro.pomodoro.service.PomodoroApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService {

    private final PomodoroApplicationService pomodoroService;
    private final CredencialApplicationService credencialService;
    private final UsuarioRepository usuarioRepository;

    //TODO As classes de service servem apenas para chamar outros metodos ou classes(Não possuem regra de negocios).
    @Override
    public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
        log.info("[Start]UsuarioService - criaNovoUsuario");
        var configuracaoPadrao = pomodoroService.getConfiguracaoPadrao();
        credencialService.criaNovaCredencial(usuarioNovo);
        var usuario = new Usuario(usuarioNovo, configuracaoPadrao);
        usuarioRepository.salva(usuario);
        log.info("[Finish]UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }
}
