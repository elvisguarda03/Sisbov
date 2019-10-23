package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.TipoAnimal;
import br.com.sisbov.domain.repository.TipoAnimalRepository;

public class TipoAnimalJpaRepository extends BaseJpaRepository<TipoAnimal> implements TipoAnimalRepository {
    public TipoAnimalJpaRepository() {
        super(TipoAnimal.class);
    }
}
