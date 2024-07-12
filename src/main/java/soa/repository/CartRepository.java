package soa.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import soa.model.Cart;


public interface CartRepository extends JpaRepository<Cart, Long> {
    @Query("SELECT c FROM CartModel c ORDER BY c.cartDate DESC")
    Cart findLast();

    @Modifying
    @Transactional
    @Query("DELETE FROM CartModel b WHERE b.id = ?1")
    void deleteBillById(Long id);

}
