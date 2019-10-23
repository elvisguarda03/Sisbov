package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Raca;
import br.com.sisbov.domain.repository.RacaRepository;

public class RacaJpaRepository extends BaseJpaRepository<Raca> implements RacaRepository {
    public RacaJpaRepository() {
        super(Raca.class);
    }
}
