/*19. A library wants to store details of multiple books.
Question:
Create a class Book with attributes:
 title
 author
 price
Create an array of Book objects and display the details of all books.*/

class Book {
    String title, author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {

        // Array of Book objects
        Book[] books = {
            new Book("Java", "James Gosling", 500),
            new Book("Python", "Guido van Rossum", 400),
            new Book("C++", "Bjarne Stroustrup", 600)
        };

        // Display all books
        for (Book b : books) {
            b.display();
        }
    }
}