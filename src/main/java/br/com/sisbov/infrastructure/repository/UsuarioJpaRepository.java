package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Usuario;
import br.com.sisbov.domain.repository.UsuarioRepository;

import java.util.Optional;

public class UsuarioJpaRepository extends BaseJpaRepository<Usuario> implements UsuarioRepository {

    public UsuarioJpaRepository() {
        super(Usuario.class);
    }

    public Optional<Usuario> findByUsername(String username) {
        connect();
        return super.entityManager.createQuery("FROM Usuario u WHERE u.username = :name")
                .setParameter("name", username)
                .getResultList()
                .stream()
                .findFirst();
    }
}
