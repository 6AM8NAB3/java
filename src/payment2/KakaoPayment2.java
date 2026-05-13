package payment2;

public class KakaoPayment2  implements Payment2{
    private int amount;
    private String userid;

    public KakaoPayment2(int amount, String userid) {
        this.amount = amount;
        this.userid = userid;
    }

    @Override
    public void processPay(){
        System.out.println("카드 결제 진행 중.... [카드번호: "+userid+"] [금액: "+amount+"]");
    }

    @Override
    public void showBasicInfo() {
        System.out.println("결제 된 금액은 "+amount+" 원 입니다.");
    }
}