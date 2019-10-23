package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Fazenda;
import br.com.sisbov.domain.repository.FazendaRepository;

public class FazendaJpaRepository extends BaseJpaRepository<Fazenda> implements FazendaRepository {
    public FazendaJpaRepository() {
        super(Fazenda.class);
    }
}
