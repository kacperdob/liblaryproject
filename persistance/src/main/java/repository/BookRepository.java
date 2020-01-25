package repository;

import model.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository {
    @Override
    public void save(Book book) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.getTransaction();
            tx.begin();
            session.persist(book);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    @Override
    public List<Book> findAll() {
        Transaction tx = null;
        List<Book> books = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.getTransaction();
            tx.begin();
            books = session.createQuery("from Book").list();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return books;
    }

    @Override
    public Book find(Long bookId) {
        Transaction tx = null;
        Book book = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Book b where b.id = :id")
                    .setParameter("id", bookId);
            book = (Book) query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
        return book;
    }

    @Override
    public Book findByTitle(String title) {
        Transaction tx = null;
        Book book = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Book b where b.title = :title")
                    .setParameter("title", title);
            book = (Book) query.uniqueResult();
            tx.commit();
        } catch (Exception e){
            if (tx !=null){
                tx.rollback();
            }
        }
        return book;
    }

    @Override
    public void edit(Book book) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.getTransaction();
            tx.begin();
            session.update(book);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    @Override
    public void delete(Serializable bookId) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            tx = session.getTransaction();
            tx.begin();
            Book book = session.load(Book.class, bookId);
            session.delete(book);
            tx.commit();
        } catch (Exception e){
            if (tx != null){
                tx.rollback();
            }
        }

    }

}


