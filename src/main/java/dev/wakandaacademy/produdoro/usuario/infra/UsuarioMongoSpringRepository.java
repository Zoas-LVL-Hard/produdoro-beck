package dev.wakandaacademy.produdoro.usuario.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.wakandaacademy.produdoro.usuario.domain.Usuario;

// Classe de infraestrutura feita para evitar de o codigo ser quebrado ao trocar de banco de dados por exemplo, 
// pois evita de ter que alterar alguma informação no service, basta alterar no repository e vida que segue.
public interface UsuarioMongoSpringRepository extends MongoRepository<Usuario, UUID> {

}
