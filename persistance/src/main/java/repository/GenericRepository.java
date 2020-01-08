package repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class GenericRepository<T, V> {
    private EntityManagerFactory managerFactory;
    static EntityManager em;
    private final Class<T> entityClass;
    private EntityTransaction transaction;

    protected GenericRepository() {
        managerFactory = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
        em = managerFactory.createEntityManager();
    }

    public void create(T entity) {
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public T read(V id) {
        return em.find(entityClass, id);
    }

    public void update(T entity) {
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public void delete(T entity) {
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public List<T> getEntityList() {
        return em.createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();

    }
}