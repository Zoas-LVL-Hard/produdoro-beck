package dev.wakandaacademy.produdoro.pomodoro.service;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;

@Service
public class PomodoroService implements PomodoroApplicationService {

    @Override
    public ConfiguracaoPadrao getConfiguracaoPadrao() {
        //Implementar busca das configurações padrões no MongoDB
        return ConfiguracaoPadrao.builder()
        .tempoFoco(25)
        .tempoPausaCurta(5)
        .tempoPausaLonga(15)
        .repeticoesPausaLonga(3)
        .build();
    }

}
