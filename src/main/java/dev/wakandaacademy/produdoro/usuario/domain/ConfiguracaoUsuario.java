package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import lombok.Getter;


@Getter

// TODO O usuario pode ter uma configuração padrão que é copiada para o seu próprio usuário.
// TODO O proprio usuario pode criar sua configuração de usuario.
public class ConfiguracaoUsuario {
    private Integer tempoFoco;
    private Integer tempoPausaCurta;
    private Integer tempoPausaLonga;
    private Integer repeticoesPausaLonga;

    public ConfiguracaoUsuario(ConfiguracaoPadrao configuracaoPadrao) {
        this.tempoFoco = configuracaoPadrao.getTempoFoco();
        this.tempoPausaCurta = configuracaoPadrao.getTempoPausaCurta();
        this.tempoPausaLonga = configuracaoPadrao.getTempoPausaLonga();
        this.repeticoesPausaLonga = configuracaoPadrao.getRepeticoesPausaLonga();
    }
}
