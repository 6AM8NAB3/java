package payment;

public class KakaoPayment extends Payment{
    public String userid;

    public KakaoPayment(int amount, String userid) {
        super(amount);
        this.userid = userid;
    }

    @Override
    public void processPay() {
        System.out.println("카드 결제 진행 중.... [유저 id: "+userid+"] [금액: "+amount+"]");
    }
}
