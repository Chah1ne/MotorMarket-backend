package soa.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity(name="BillModel")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

	@Column(nullable = false)
	private Boolean paid = false;
    @Temporal(TemporalType.DATE)
    private Date billDate;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "bill_cart",
			joinColumns = @JoinColumn(name = "bill_id"),
			inverseJoinColumns = @JoinColumn(name = "cart_id")
	)    private List<Cart> carts;

	public Bill() {
		super();
	}

	public Bill(Long id, double amount, Boolean paid, Date billDate, List<Cart> carts) {
		super();
		this.id = id;
		this.amount = amount;
		this.paid = paid;
		this.billDate = billDate;
		this.carts = carts;
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

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", amount=" + amount + ", paid=" + paid + ", billDate=" + billDate + ", carts="
				+ carts + "]";
	}
    
    
 }
