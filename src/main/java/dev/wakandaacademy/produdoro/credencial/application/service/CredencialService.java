package dev.wakandaacademy.produdoro.credencial.application.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

@Service
public class CredencialService implements CredencialApplicationService {

    @Override
    public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {
        //Implementar metodo para criar nova credencial
    }

}
