package payment;

public class PaymentMain {
    public  static void main(String[] args) {
        Payment[] payments  = {
                new CardPayment(30000,"2708-5914"),
                new KakaoPayment(30000,"6AM8NAB3")
        };
        for (Payment p: payments) {
            p.processPay();
            p.showBasicInfo();
        }
    }
}

