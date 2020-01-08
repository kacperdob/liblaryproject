package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Borrow {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_borrow")
    private Integer idBorrow;

    @ManyToOne
    @JoinColumn (name = "id_book")
    private Book bookId;

    @ManyToOne
    @JoinColumn (name = "id_borrower")
    private Borrower borrowerId;

    @Column (name = "rental_date", nullable = false)
    private Date rentalDate;

    public Borrow(){}

    public Borrow(Book bookId, Borrower borrowerId, Date rentalDate) {
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.rentalDate = rentalDate;
    }

    public Integer getIdBorrow() {
        return idBorrow;
    }

    public void setIdBorrow(Integer idBorrow) {
        this.idBorrow = idBorrow;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Borrower getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Borrower borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }


}
