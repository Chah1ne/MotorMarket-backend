package soa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soa.model.Cart;
import soa.model.Product;
import soa.repository.CartRepository;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    @Override
    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }


    @Override
    public Cart addToCart(int qte, Product product) {
    	Cart cart = new Cart();
        cart.setCartDate(new Date());
        cart.setProduct(product);
        cart.setQuantity(qte);
        cart.setAmount(cart.getAmount() * qte);

        return cartRepository.save(cart);
    }

    @Override
    public void removeCart(Long id) {
    	 cartRepository.deleteById(id);
    }
}
