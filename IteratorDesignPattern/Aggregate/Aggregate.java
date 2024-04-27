package IteratorDesignPattern.Aggregate;

import IteratorDesignPattern.Iterator.OurIterator;

public interface Aggregate {

    // maintains list of Collection
    // What ever Collection client wants to use Aggregate will internally call that CollectionIterator
    // Suppose client want to use PriorityQueue so Aggregate will call the PriorityQueueIterator and
    // will give that to client so that they can use it
    public OurIterator createIterator();
}
