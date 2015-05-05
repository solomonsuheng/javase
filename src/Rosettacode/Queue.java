package Rosettacode;

/**
 * Created by Suheng on 15/5/5.
 */
public class Queue<E> {
    Node<E> head = null, tail = null;

    static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public Queue() {

    }

    //check if the queue is empty
    public boolean empty() {
        return head == null;
    }

    //standard queue name for "push"
    public void enqueue(E value) {
        Node<E> newNode = new Node<E>(value, null);
        if (empty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    //standard queue name for pop
    public E dequeue() throws java.util.NoSuchElementException {
        if (empty()) {
            //there is no elment
            throw new java.util.NoSuchElementException("No more elemnts");
        }
        E retVal = head.value;
        head = head.next;
        return retVal;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(123);
        q.enqueue(1234);
        q.enqueue(12356);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
