class BankApplication {

    // Method that throws exception
    static void processTransaction(int amount) throws Exception {

        if (amount > 5000) {
            throw new Exception("Limit exceeded");
        }

        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        try {
            // Call method
            processTransaction(6000);  // you can change value for testing
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}