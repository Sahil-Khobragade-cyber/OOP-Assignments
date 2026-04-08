/*12. Design a payment processing system.
Create an abstract class Payment with an abstract method pay(double amount).
Create subclasses:
 CreditCardPayment
 UPIPayment
 NetBankingPayment
Each subclass should implement the pay() method differently.*/

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1000);
        p2.pay(500);
        p3.pay(2000);
    }
}