package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Animal;
import br.com.sisbov.domain.repository.AnimalRepository;

public class AnimalJpaRepository extends BaseJpaRepository<Animal> implements AnimalRepository {
    public AnimalJpaRepository() {
        super(Animal.class);
    }
}
