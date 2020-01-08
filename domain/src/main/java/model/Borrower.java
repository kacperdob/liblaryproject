package model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrower")
    private Integer idBorrower;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "id_borrower_details")
    private BorrowerDetails borrowerDetailsId;

    @OneToMany(mappedBy = "borrowerId")
    private List<Borrow> borrows;

    public Borrower (){}

    public Borrower(String firstName, String lastName, BorrowerDetails borrowerDetailsId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.borrowerDetailsId = borrowerDetailsId;
    }

    public Integer getIdBorrower() {
        return idBorrower;
    }

    public void setIdBorrower(Integer idBorrower) {
        this.idBorrower = idBorrower;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BorrowerDetails getBorrowerDetailsId() {
        return borrowerDetailsId;
    }

    public void setBorrowerDetailsId(BorrowerDetails borrowerDetailsId) {
        this.borrowerDetailsId = borrowerDetailsId;
    }
}
