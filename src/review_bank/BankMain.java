package review_bank;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bank  = new BankAccount("조준호",0);
        bank.deposit(10000);
        bank.withdraw(8000);
        bank.printInfo();
    }
}
