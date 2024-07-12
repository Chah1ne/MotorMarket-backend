package soa.services;

import soa.model.Cart;
import soa.model.Product;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();

    Cart createCart(Cart cart);

    Cart addToCart(int qte, Product product);

	void removeCart(Long id);
}
