public class BookLibrarySystem {
    

    String title;
    String author;
    int isbn;

    static int totalBooks = 0;

    // Instance methods: borrowBook(), returnBook().

    public void borrowBook() {
        System.out.println("You have borrowed: " + title + " by " + author);
    }
    public void returnBook() {
        System.out.println("You have returned: " + title + " by " + author);
    }

    // Static method: getTotalBooks(), to get the total number of books in the library.
    public static int getTotalBooks() {
        return totalBooks;
    }

    public BookLibrarySystem(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void main(String[] args) {
        BookLibrarySystem book1 = new BookLibrarySystem("1984", "George Orwell", 123456);
        BookLibrarySystem book2 = new BookLibrarySystem("To Kill a Mockingbird", "Harper Lee", 789012);

        book1.borrowBook();
        book2.borrowBook();

        book1.returnBook();

        System.out.println("Total books in library: " + BookLibrarySystem.getTotalBooks());
    }
}
