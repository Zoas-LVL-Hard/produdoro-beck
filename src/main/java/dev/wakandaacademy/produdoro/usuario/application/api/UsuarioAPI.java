package dev.wakandaacademy.produdoro.usuario.application.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController  //TODO É normalmente usado em combinação com anotações manipulador com base na anotação.@Component@Controller@ResponseBodyModelAndView@RequestMapping
                //TODO A classe representa uma resposta HTTP, incluindo cabeçalhos, corpo e status. Ele é usado para retornar dados.ResponseEntity.


@RequestMapping(value = "/v1/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioCriadoResponse postNovoUsuario(@RequestBody @Valid UsuarioNovoRequest usuarioNovo);

}
