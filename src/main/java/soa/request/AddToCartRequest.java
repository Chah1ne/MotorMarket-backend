package soa.request;

import soa.model.Product;

public class AddToCartRequest {
    private int qte;
    private Product product;

    public int getQte() {
        return qte;
    }

    public Product getProduct() {
        return product;
    }
}
