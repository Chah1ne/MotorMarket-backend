package soa.request;

public class RemoveCardFromBillRequest {
    private Long cardId;
    private Long billId;

    public Long getCardId() {
        return cardId;
    }

    public Long getBillId() {
        return billId;
    }
}
