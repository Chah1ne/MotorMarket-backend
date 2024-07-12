package soa.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soa.model.Bill;
import soa.model.Cart;
import soa.model.Product;
import soa.repository.BillRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    @Transactional
    @Override
    public Bill addBill(Cart cart) {
        // Find the last bill
        List<Bill> bills = billRepository.findLast();

        Bill bill;
        if (bills.isEmpty() || bills.get(0).getPaid()) {
            // Create a new bill if no bills are present or the last bill is paid
            bill = new Bill();
            bill.setBillDate(new Date());
            bill.setPaid(false);
            bill.setCarts(new ArrayList<>());
        } else {
            // Use the last bill if it exists and is not paid
            bill = bills.get(0);
        }

        // Merge the cart entity
        cart = entityManager.merge(cart);

        // Update bill properties
        bill.getCarts().add(cart);
        bill.setAmount(bill.getAmount() + cart.getAmount());

        // Save the bill
        return billRepository.save(bill);
    }


    @Override
    public Bill makePayment(Long id) {
        Bill bill = billRepository.getBillById(id);
        bill.setPaid(true);
        return billRepository.save(bill);
    }

    @Override
    public Bill removeCardFromBill(Long cardId, Long billId) {
        Bill bill = billRepository.getById(billId);
        bill.getCarts().removeIf(card -> card.getId().equals(cardId));
        return billRepository.save(bill);
    }

    @Override
    public void removeBill(Long id) {
        billRepository.deleteById(id);
    }

}
