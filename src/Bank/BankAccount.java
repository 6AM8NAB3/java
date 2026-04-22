package Bank;

public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    } //생성자는 한번에

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount<0){
            System.out.println("출금 금액이 잘못 되었습니다.");
            return;
        }
        if (amount>balance) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        this.balance -= amount;
    }

    public void printInfo() {
        System.out.printf("계좌주: %s\n잔액: %d",name,balance);
    }
}
