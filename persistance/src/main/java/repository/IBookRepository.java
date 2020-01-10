package repository;

import model.Book;

import java.io.Serializable;
import java.util.List;

public interface IBookRepository  {

  void save(Book book);

    void create(Book book);

    List<Book> findAll();

    Book find (Long bookId);

    void edit (Book book);

    void delete (Serializable bookId);

}
