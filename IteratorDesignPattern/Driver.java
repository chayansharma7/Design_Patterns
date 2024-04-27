package IteratorDesignPattern;

import IteratorDesignPattern.Aggregate.Library;
import IteratorDesignPattern.Iterator.OurIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
        new Book("Science", 100),
        new Book("Maths", 200),
        new Book("English", 300),
        new Book("French", 400)
        );

        Library lib = new Library(bookList);
        OurIterator iterator = lib.createIterator();

        // In case we have other Iterators added all will implement functions written in Iterator interface
        while(iterator.hasNext()){

            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());
            System.out.println(book.getBookPrice());
        }
    }
}
