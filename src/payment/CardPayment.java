package payment;

public class CardPayment extends Payment {
    public String cardNumber;

    public CardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void processPay() {
        System.out.println("카드 결제 진행 중.... [카드번호: "+cardNumber+"] [금액: "+amount+"]");
    }
}
