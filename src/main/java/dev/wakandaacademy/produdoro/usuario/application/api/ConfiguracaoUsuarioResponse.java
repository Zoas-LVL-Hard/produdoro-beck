package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {
    private final Integer tempoFoco;
    private final Integer tempoPausaCurta;
    private final Integer tempoPausaLonga;
    private final Integer repeticoesPausaLonga;
    
    //TODO Geralmente as classes em torno da API seguem as regras de negocios.
    //TODO Constructor to create a response object from a user's configuration
    public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracao) {
        this.tempoFoco = configuracao.getTempoFoco();
        this.tempoPausaCurta = configuracao.getTempoPausaCurta();
        this.tempoPausaLonga = configuracao.getTempoPausaLonga();
        this.repeticoesPausaLonga = configuracao.getRepeticoesPausaLonga();
    }
}
