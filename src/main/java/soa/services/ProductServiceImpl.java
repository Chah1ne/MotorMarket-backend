package soa.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soa.model.Product;
import soa.repository.ProductRepository;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService  {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}

