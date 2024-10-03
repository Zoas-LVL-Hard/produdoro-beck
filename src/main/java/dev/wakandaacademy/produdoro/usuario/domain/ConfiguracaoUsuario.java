package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter

// todo O proprio usuario pode criar sua configuração de usuario.
public class ConfiguracaoUsuario {
    private Integer tempoFoco;
    private Integer tempoPausaCurta;
    private Integer tempoPausaLonga;
    private Integer repeticoesPausaLonga;
}
