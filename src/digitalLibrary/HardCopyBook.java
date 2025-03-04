package digitalLibrary;

class HardCopyBook extends Book {
    private int pageCount;
    private String coverType;

    public HardCopyBook(String title, String isbn, Author author, Publisher publisher,
                        int pageCount, String coverType) {
        super(title, isbn, author, publisher);
        this.pageCount = pageCount;
        this.coverType = coverType;
    }

    // Getters and setters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String getFormat() {
        return "Hard Copy";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPage Count: " + pageCount +
                "\nCover Type: " + coverType;
    }
}