package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Vacina;
import br.com.sisbov.domain.repository.VacinaRepository;

public class VacinaJpaRepository extends BaseJpaRepository<Vacina> implements VacinaRepository {
    public VacinaJpaRepository() {
        super(Vacina.class);
    }
}
