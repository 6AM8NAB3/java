package payment;

public class PaymentMain {
    public  static void main(String[] args) {
        Payment payments = new CardPayment(10000,"xxxx-xxxx");

        payments.processPay();
        payments.showBasicInfo();
        
        }
    }

