package IteratorDesignPattern.Aggregate;

import IteratorDesignPattern.Book;
import IteratorDesignPattern.Iterator.BookIterator;
import IteratorDesignPattern.Iterator.OurIterator;

import java.util.List;
public class Library implements Aggregate{

    List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public OurIterator createIterator(){
        return new BookIterator(bookList);
    }
}
