package dev.wakandaacademy.produdoro.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

//todo Classe para a captura e tratamento de exceções (Essa classe está com o tratamento relativamente generico)
@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
    @ExceptionHandler(APIException.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(APIException ex) {
        return ex.buildErrorResponseEntity();
    }


        @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex) {
        log.error("Exception: ", ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorApiResponse.builder()
                        .description("INTERNAL_SERVER_ERROR!")
                        .message("CONTATE O ADMINISTRADOR DO SISTEMA!")
                        .build());
    }
}
