import java.util.Scanner;

class Book {
    String title;
    String author;

    // Constructor to store title and author using 'this'
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author line by line
        String title = scanner.nextLine();
        String author = scanner.nextLine();

        // Create one Book object
        Book b = new Book(title, author);

        // Call the display method
        b.display();
        
        scanner.close();
    }
}
