package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.entity.Animal;

public class AnimalJpaRepository extends BaseJpaRepository<Animal> {
    public AnimalJpaRepository() {
        super(Animal.class);
    }
}
