package IteratorDesignPattern.Iterator;

import IteratorDesignPattern.Book;
import java.util.List;

public class BookIterator implements OurIterator {

    // these can be LinkedList Iterator class, PriorityQueue Iterator which implements Iterator
    private List<Book> books;
    private int index = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {

        if(this.hasNext()){
            return books.get(index++);
        }
        return null;
    }
}
