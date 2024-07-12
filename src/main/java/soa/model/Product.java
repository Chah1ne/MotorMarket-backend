package soa.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity(name="ProductModel")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private double rating;

	@OneToMany(mappedBy = "product")
	private Set<Cart> carts;
	
    public Product() {
		super();
	}

	public Product(Long id, String title, double price, String description, String category, String image,
			double rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
		this.image = image;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", category=" + category + ", image=" + image + ", rating=" + rating + "]";
	}
    
    
  }
