class Book {
    private static String libraryName = "City Library"; // Static variable
    private final String isbn; // Final variable 
    private String title;
    private String author;

    // Constructor using this
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    //method to display details
    public void displayDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
    //static method
    public static void displayName() {
        System.out.println("Library Name: " + libraryName);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("123-4", "Java", "ABC");
        Book book2 = new Book("123-5", "Python", "XYZ");

        book1.displayDetails();
        book2.displayDetails();
        Book.displayName();
    }
}
/* Library: City Library
ISBN: 123-4
Title: Java
Author: ABC
Library: City Library
ISBN: 123-5
Title: Python
Author: XYZ
Library Name: City Library */