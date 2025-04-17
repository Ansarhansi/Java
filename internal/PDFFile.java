package internal;

class PDFFile extends File {
    @Override
    public void describe() {
        System.out.println("This is a PDF File.");
    }
    public void openPDF() {
        System.out.println("Opening PDF File.");
    }
}