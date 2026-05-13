package payment2;

public class CardPayment2  implements Payment2 {
    private int amount;
    private String cardNumber;

    public CardPayment2(int amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPay(){
        System.out.println("카드 결제 진행 중.... [카드번호: "+cardNumber+"] [금액: "+amount+"]");
    }

    @Override
    public void showBasicInfo() {
        System.out.println("결제 된 금액은 "+amount+" 원 입니다.");
    }
}
