package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
