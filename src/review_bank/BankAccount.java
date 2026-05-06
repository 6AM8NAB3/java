package review_bank;

public class BankAccount {
    private String name;
    private int balance;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (amount<0) {
            System.out.println("출금 금액이 잘못되었습니다.");
            return;
        }

        if (amount>balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }



        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void printInfo() {
        System.out.printf("계좌주: %s\n잔액: %d",name,balance);
    }
}
