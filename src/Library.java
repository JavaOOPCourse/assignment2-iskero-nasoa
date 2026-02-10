public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        // implement
        if(count < books.length){
            books[count] = book;
            count ++;
        } else {
            System.out.println("library is full.");
        }
    }

    public void addEBook(EBook book) {
        // implement
        if(count < books.length){
            books[count] = book;
            count ++;
        } else {
            System.out.println("library is full.");
        }
    }

    // TODO: Display all books
    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            Book k = books[i];
            System.out.println(k.getTitle() + " - " + k.getAuthor());
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(int i = 0; i < count; i ++){
            Book k = books[i];
            if(k.getTitle().equals(title)){
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        // implement
        Book k = searchByTitle(title);
        if (k != null){
            k.borrowBook();
        } else {
            System.out.println("there is no book with this title");
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        // implement
        Book k = searchByTitle(title);
        if (k != null){
            k.returnBook();
        } else {
            System.out.println("there is no book with this title");
        }
    }
}
