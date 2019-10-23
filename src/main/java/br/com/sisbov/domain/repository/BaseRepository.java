package br.com.sisbov.domain.repository;

import java.util.List;

public interface BaseRepository<T> {
    boolean save(T obj);
    T findById(Long id);
    List<T> findAll();
    boolean update(T obj);
    boolean deleteById(Long id);
    void delete(T obj);
}
