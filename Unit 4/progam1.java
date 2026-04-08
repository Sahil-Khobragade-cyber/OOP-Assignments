import java.util.Scanner;

class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            // Check condition and throw exception manually
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }

            // Deduct amount
            balance = balance - amount;

            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}