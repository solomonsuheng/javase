package Coursera.Algorithms.StackAndQueue;

import java.util.Iterator;

/**
 * Created by Suheng on 7/2/15.
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(Item item) {
        Node oldfirst = this.first;
        this.first = new Node();
        this.first.item = item;
        this.first.next = oldfirst;
    }

    public Item pop() {
        Item item = this.first.item;
        this.first = this.first.next;
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
