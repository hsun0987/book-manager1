package base.repository;

import base.Book;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface BookRepository {
    void addBook(Book book);
    Book getBook(Long id);
    List<Book> gethashMapBook();
    List<Book> gethashMapBook(Predicate<Book> predicate);
    List<Book> gethashMapBook(Comparator<Book> comparator);
    boolean setBook(Book book);
    boolean removeBook(Long id);
}