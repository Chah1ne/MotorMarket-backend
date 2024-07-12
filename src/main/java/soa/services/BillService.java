package soa.services;

import soa.model.Bill;
import soa.model.Cart;

import java.util.List;

public interface BillService {
    List<Bill> getAllBills();

    Bill addBill(Cart cart);

    Bill makePayment(Long id);

    Bill removeCardFromBill(Long cardId, Long billId);

    void removeBill(Long id);
}
