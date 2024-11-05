package dev.wakandaacademy.produdoro.usuario.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;

// Camada feita para resolver questões de acesso a dados.
@Repository
@RequiredArgsConstructor
public class UsuarioRespositoryMongoDB implements UsuarioRepository {

    private final UsuarioMongoSpringRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioMongoRepository.save(usuario);

    }

}
