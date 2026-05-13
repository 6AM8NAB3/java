package payment2;

public class PaymentMain2 {
    public static void main(String[] args) {
        Payment2[] payments  = {
                new CardPayment2(30000,"2708-5914"),
                new KakaoPayment2(30000,"6AM8NAB3")
        };
        for (Payment2 p2: payments) {
            p2.processPay();
            p2.showBasicInfo();
        }
    }
}
