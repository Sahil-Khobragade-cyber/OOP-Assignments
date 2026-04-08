/*2.Design a Book class (title, author, ISBN) and a Library class that manages a
collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
add a new book, remove a book by ISBN, and display all available books. */

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    void removeBook(String ISBN) {
        boolean found = false;

        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }
}

// Changed class name here
public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Guide", "Guido van Rossum", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAll Books:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("\nAfter Removal:");
        lib.displayBooks();
    }
}