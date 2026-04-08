/*18. A bank has a fixed interest rate that should not be changed once it is defined.
Question:
Create a class Bank with a final variable interestRate.
Create a method calculateInterest(double amount) that calculates the interest using
the fixed rate.
Write a program to calculate interest for different customers.*/

class Bank {
    final double interestRate = 5.0; // fixed rate

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Bank b = new Bank();

        double c1 = b.calculateInterest(10000);
        double c2 = b.calculateInterest(20000);
        double c3 = b.calculateInterest(5000);

        System.out.println("Customer 1 Interest: " + c1);
        System.out.println("Customer 2 Interest: " + c2);
        System.out.println("Customer 3 Interest: " + c3);
    }
}