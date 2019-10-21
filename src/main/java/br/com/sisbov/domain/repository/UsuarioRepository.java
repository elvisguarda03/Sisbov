package br.com.sisbov.domain.repository;

import br.com.sisbov.domain.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends BaseRepository<Usuario> {
    Optional<Usuario> findByUsername(String username);
}
