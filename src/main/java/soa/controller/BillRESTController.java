package soa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import soa.model.Bill;
import soa.model.Cart;
import soa.model.Product;
import soa.request.RemoveCardFromBillRequest;
import soa.services.BillService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/bills")
public class BillRESTController {

    private final BillService billService;

    @Autowired
    public BillRESTController(BillService billService) {
        this.billService = billService;
    }

    @GetMapping("/all")
    public List<Bill> getAllBills() {
        return billService.getAllBills();
    }

    @PostMapping("/add")
    public Bill addBill(@RequestBody Cart cart) {
        return billService.addBill(cart);
    }

    @GetMapping("/edit/{id}")
    public Bill makePayment(@PathVariable("id") Long id) {
        return billService.makePayment(id);
    }

    @PutMapping("/remove-card")
    public Bill removeCard(@RequestBody RemoveCardFromBillRequest body) {
        return billService.removeCardFromBill(body.getCardId(), body.getBillId());
    }

    @DeleteMapping("/remove/{id}")
    public void removeBill(@PathVariable Long id) {
         billService.removeBill(id);
    }

}
