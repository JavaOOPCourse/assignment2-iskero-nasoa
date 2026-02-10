import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("book name: ");
                    String title = scanner.nextLine();
                    System.out.println("author: ");
                    String author = scanner.nextLine();
                    System.out.println("year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    Book newBook = new Book(title, author, year);

                    library.addBook(newBook);
                    break;


                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("book name: ");
                    String Etitle = scanner.nextLine();

                    System.out.println("author: ");
                    String Eauthor = scanner.nextLine();

                    System.out.println("year: ");
                    int Eyear = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("book size: ");
                    double Esize = scanner.nextDouble();

                    EBook newEbook = new EBook(Etitle, Eauthor, Eyear, Esize);

                    library.addBook(newEbook);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("title: ");
                    String Stitle = scanner.nextLine();

                    System.out.println(library.searchByTitle(Stitle));
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("title: ");
                    String Btitle = scanner.nextLine();

                    library.borrowBook(Btitle);
                    break;


                case 6:
                    // TODO: Return book
                    System.out.println("title: ");
                    String Rtitle = scanner.nextLine();

                    library.returnBook(Rtitle);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}
