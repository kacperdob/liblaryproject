package pl.sda.servises;

import model.Book;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    BookRepository bookRepository = new BookRepository();

    public List<Book> findAll (){
        return bookRepository.getEntityList();
    }
}
