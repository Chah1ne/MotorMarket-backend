package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soa.model.Cart;
import soa.request.AddToCartRequest;
import soa.services.CartService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/carts")
public class CartRESTController {

    private final CartService cartService;

    @Autowired
    public CartRESTController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/all")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }



    @PostMapping("/add")
    public Cart addToCart(@RequestBody AddToCartRequest request) {
        return cartService.addToCart(request.getQte(), request.getProduct());
    }

    @DeleteMapping("/remove/{id}")
    public void removeCart(@PathVariable Long id) {
         cartService.removeCart(id);
    }

}
