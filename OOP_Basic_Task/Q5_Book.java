import java.util.ArrayList;

public class Q5_Book {
    static class Book {
        String title, author, isbn;

        Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return title + " by " + author + ", ISBN: " + isbn;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630"));
        books.add(new Book("An Introduction to Python", "Guido van Rossum", "9355423489"));

        System.out.println("List of books:");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\nAfter removing The C Programming Language:");
        books.remove(0);

        System.out.println("List of books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}