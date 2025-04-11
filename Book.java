public class Book {
    // Attributes
    String title;
    String author;
    double price;
    
    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Copy Constructor
    public Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }
    
    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book();  // Default Constructor
        Book book2 = new Book("Java Programming", "John Doe", 500.0); // Parameterized Constructor
        Book book3 = new Book(book2); // Copy Constructor
        
        // Displaying book details
        System.out.println("Default Book:");
        book1.displayBook();
        
        System.out.println("Parameterized Book:");
        book2.displayBook();
        
        System.out.println("Copied Book:");
        book3.displayBook();
    }
}
