class FileExtensionExtractor {
    public static void main(String[] args) {
        String fileName = "report.pdf";
        int index = fileName.lastIndexOf(".");
        String extension = fileName.substring(index + 1);
        System.out.println(extension);
    }
}