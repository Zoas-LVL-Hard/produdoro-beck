package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Value;

//TODO aqui é colocado os parametros para a criação de um novo usuario no sistema, ou seja, o que entra.
@Value
public class UsuarioNovoRequest {
	//Os atributos estão como final porque não ocorrerá a mudança dos valores dos atributos, eles serão fixos.
    @Email
	private final String email;
	@Size(min = 6)
	private final String senha;
}
