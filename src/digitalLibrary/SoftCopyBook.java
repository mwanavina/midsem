package digitalLibrary;

class SoftCopyBook extends Book {
    private String fileFormat;
    private double fileSizeMB;

    public SoftCopyBook(String title, String isbn, Author author, Publisher publisher,
                        String fileFormat, double fileSizeMB) {
        super(title, isbn, author, publisher);
        this.fileFormat = fileFormat;
        this.fileSizeMB = fileSizeMB;
    }

    // Getters and setters
    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public void print() {
        System.out.println("Printing " + getTitle() + " (" + getFileFormat() + ")");
    }

    @Override
    public String getFormat() {
        return "Soft Copy (" + fileFormat + ")";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFile Format: " + fileFormat +
                "\nFile Size: " + fileSizeMB + " MB";
    }
}
