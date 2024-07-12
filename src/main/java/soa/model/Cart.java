package soa.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name="CartModel")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    
    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date cartDate;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToMany(mappedBy = "carts", cascade = CascadeType.PERSIST)
	private List<Bill> bills;
	public Cart() {
		super();
	}

	public Cart(Long id, double amount, int quantity, Date cartDate, Product product) {
		super();
		this.id = id;
		this.amount = amount;
		this.quantity = quantity;
		this.cartDate = cartDate;
		this.product = product;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", amount=" + amount + ", quantity=" + quantity + ", cartDate=" + cartDate
				+ ", product=" + product + "]";
	}
    
    

}
