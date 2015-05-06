package Rosettacode;

/**
 * Created by Suheng on 15/5/5.
 */
public class Stack<E> {
    Node<E> top = null;

    static class Node<E> {
        E value;
        Node<E> next = null;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public Stack() {
        int a = 10;
    }


    //push data into stack
    public void push(E value) {
        top = new Node(value, top);
    }

    //pop data from stack
    public E pop() throws java.util.NoSuchElementException {
        if (empty()) {
            throw new java.util.NoSuchElementException("Can't pop from an empty stack");
        }
        E retVal = top.value;
        top = top.next;
        return retVal;
    }


    //check the stack if empty
    private boolean empty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('a');
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
