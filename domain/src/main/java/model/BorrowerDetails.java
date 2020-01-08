package model;

import javax.persistence.*;

@Entity
@Table(name = "borrower_details")
public class BorrowerDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_borrower_details")
    private Integer idBorrowerDetails;
    private String address;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "borrowerDetailsId")
    private Borrower borrower;

    public BorrowerDetails(){}

    public BorrowerDetails(String address, String email, String phone) {
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Integer getIdBorrowerDetails() {
        return idBorrowerDetails;
    }

    public void setIdBorrowerDetails(Integer idBorrowerDetails) {
        this.idBorrowerDetails = idBorrowerDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
