package payment;

abstract class Payment {
    public int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public void showBasicInfo() {
        System.out.println("결제 된 금액은 "+amount+" 원 입니다.");
    }

    abstract void processPay();

}
