public class EBook extends Book {

    private double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
        // implement
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "title: " + this.getTitle() + "author: " + this.getAuthor() + "year: " + this.getYear() + "avaiable: " + this.isAvailable() + "file-size:" + this.fileSize;
    }
}
