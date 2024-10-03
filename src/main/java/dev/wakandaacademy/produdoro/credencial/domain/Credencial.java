package dev.wakandaacademy.produdoro.credencial.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Credencial")

public class Credencial {
    @MongoId(targetType = FieldType.STRING)
    @Getter
    private String usuario;
    private String senha;

    /**
     * @param usuario id do usuario
     * @param senha   senha do usuario já configurado a criptografia (BCryptPasswordEncoder) ****************
     */
    public Credencial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = new BCryptPasswordEncoder().encode(senha);
    }

    //TODOS Método usado para validar o usuario. Também é criado já com a senha criptografada.
    public String getPassword() {
        return senha;
    }

}
