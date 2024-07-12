package soa.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name="PaymentModel")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    private String cardHolderName;
    private String creditCardNumber;
    private String expirationDate;
    private String cvv;
    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String address;
    private String country;
    private String state;
    private String zip;

    public Payment(Long id, double amount, Date paymentDate, String cardHolderName, String creditCardNumber, String expirationDate, String cvv, String firstName, String lastName, String email, String tel, String address, String country, String state, String zip) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.cardHolderName = cardHolderName;
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.address = address;
        this.country = country;
        this.state = state;
        this.zip = zip;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
