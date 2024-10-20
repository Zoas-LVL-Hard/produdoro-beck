package dev.wakandaacademy.produdoro.handler;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor (access = AccessLevel.PRIVATE)
@Getter
public class ErrorApiResponse {
    private String message;

    //todo O campo abaixo só irá aparecer caso seja colocada uma descrição.
    @JsonInclude(JsonInclude.Include.NON_EMPTY) 
    private String description;

}
