import java.util.Arrays;

public class Library {
    String address;
    Book[] books = new Book[2];

    public Library(String address) {
        this.address = address;
    }

    public void addBook(Book book) {
        // add book to books array if there is space, otherwise make a new array with
        // double the size

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }

        // expand array
        Book[] newBooks = Arrays.copyOf(books, books.length * 2);
        newBooks[books.length] = book;
        books = newBooks;
    }

    static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    void printAddress() {
        System.out.println(this.address);
    }

    void borrowBook(String title) {
        // check if book is available
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                if (books[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                } else {
                    books[i].borrowed();
                    System.out.println("You successfully borrowed " + title);
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    void printAvailableBooks() {
        boolean empty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && !books[i].isBorrowed()) {
                System.out.println(books[i].getTitle());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("No book in catalog");
        }
    }

    void returnBook(String title) {
        // check if book is available
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i].returned();
                System.out.println("You successfully returned " + title);
                return;
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}