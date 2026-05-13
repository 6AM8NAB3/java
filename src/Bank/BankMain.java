package bank;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("조준호",10000);
        bank.deposit(10000);
        bank.withdraw(-1000);
        bank.printInfo();
    }
}
