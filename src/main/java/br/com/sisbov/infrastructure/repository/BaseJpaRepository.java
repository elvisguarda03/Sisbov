package br.com.sisbov.infrastructure.repository;

import br.com.sisbov.domain.repository.BaseRepository;
import br.com.sisbov.infrastructure.JPAUtil;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public abstract class BaseJpaRepository<T> implements BaseRepository<T> {
    protected EntityManager entityManager;
    private Class<T> type;

    public BaseJpaRepository(Class<T> type) {
        this.type = type;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public boolean save(T obj) {
        try {
            connect();
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public T findById(Long id) {
        try {
            connect();
            entityManager.getTransaction().begin();
            T obj = entityManager.find(type, id);
            entityManager.close();
            return obj;
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public List<T> findAll() {
        try {
            connect();
            entityManager.getTransaction().begin();
            List<T> objs = entityManager.createQuery("FROM " + type.getName()).getResultList();
            entityManager.close();
            return objs;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public boolean update(T obj) {
        try {
            connect();
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void deleteById(Long id) {
        try {
            connect();
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(entityManager.find(type, id)));
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception ex) {
            // ignoring
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void delete(T obj) {
        try {
            connect();
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(obj));
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (Exception ex) {
            // ignoring
        }
    }

    protected void connect() {
        entityManager = JPAUtil.getEntityManager();
    }
}