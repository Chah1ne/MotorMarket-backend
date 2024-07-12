package soa.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import soa.model.Bill;

import java.util.List;


public interface BillRepository extends JpaRepository<Bill, Long> {
    @Query("SELECT b FROM BillModel b ORDER BY b.billDate, b.id")
    List<Bill> findLast();
    @Modifying
    @Transactional
    @Query("DELETE FROM BillModel b WHERE b.id = ?1")
    void deleteBillById(Long id);

    @Query("SELECT b FROM BillModel b WHERE b.id = ?1")
    Bill getBillById(Long id);

}

