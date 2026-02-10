public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        this.isAvailable = false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        this.isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "title: " + this.title + " author: " + this.author + " year: " + this.year + " available: " + this.isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        Book neww = (Book) obj;
        return (this.title.equals(neww.title) && this.author.equals(neww.author) && this.year == neww.year);
    }
}
