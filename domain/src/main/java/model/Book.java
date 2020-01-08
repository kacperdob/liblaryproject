package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_book")
    private Integer idBook;
    private Boolean borrow;
    private String category;
    @Column (nullable = false)
    private String isbn;
    private Integer pages;
    @Column (name = "release_date")
    private Date releaseDate;

    @Column (length=500)
    private String summary;
    @Column (nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private Author authorId;

    @OneToMany (mappedBy = "bookId")
    private List<Borrow> borrows;

    public Book(){

    }

    public Book(boolean borrow, String category, String isbn, int pages, Date releaseDate, String summary, String title, Author authorId) {
        this.borrow = borrow;
        this.category = category;
        this.isbn = isbn;
        this.pages = pages;
        this.releaseDate = releaseDate;
        this.summary = summary;
        this.title = title;
        this.authorId = authorId;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author authorId) {
        this.authorId = authorId;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }
}
