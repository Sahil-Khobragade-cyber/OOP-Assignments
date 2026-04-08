class FileProcessingSystem {

    public static void main(String[] args) {

        try {
            // Simulating file reading
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
        }
    }
}