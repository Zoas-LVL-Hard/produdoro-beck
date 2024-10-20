package dev.wakandaacademy.produdoro.handler;

import java.util.Optional;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@Log4j2
public class APIException extends RuntimeException {

    private HttpStatusCode statusException;
    private ErrorApiResponse bodyException;

    //todo É criado uma exception personalizada e dentro de description criado um novo metodo representado mais a baixo
    //!Esse construtor gera os dois atributos que preciso para construir o buildErrorResponseEntity (o ultimo metodo lá em baixo!)
    private APIException(HttpStatusCode statusException, String message, Exception e) {
        super(message, e);
        this.statusException = statusException;
        this.bodyException = ErrorApiResponse.builder()
                .message(message)
                .description(getDescription(e))
                .build();
    }
    //Instancia da APIException
    public static APIException build (HttpStatusCode statusException, String message) {
        return new APIException(statusException, message, null);
    } 
    
    public static APIException build (HttpStatusCode statusException, String message, Exception e) {
        log.error("Exception: ", e);
        return new APIException(statusException, message, e);
    }

    private String getDescription(Exception e) {
        return Optional.ofNullable(e)
        .map(APIException::getMessageCause).orElse(null);
        
    }

    private static String getMessageCause(Exception e) {
        return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
    }

    //!exception personalizada para a classe APIException
    public ResponseEntity<ErrorApiResponse> buildErrorResponseEntity() {
        return ResponseEntity
                .status(statusException)
                .body(bodyException);
    }

    

}
