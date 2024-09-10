package Codeday32_Composition;

import java.util.*;
import java.util.Collection;
class Book{
    private String title;
    private String author;

    public Book(String title,String author) {
        this.title = title;
        this.author = author;
    }

}
class Library{
private final List<Book> book;

    public Library(List<Book> book) {
        this.book = book;
    }

    public List<Book> getBook() {
        return book;
    }
}
public class MainTest {
    public static void main(String[] args) {


        Book b1
                = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2
                = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference",
                "Herbert Schildt");

        List<Book> book = new ArrayList<Book>();
        book.add(b1);
        book.add(b2);
        book.add(b3);

        Library l1 = new Library(book);
//    List<book>
        System.out.println(l1.getBook());

    }
}
