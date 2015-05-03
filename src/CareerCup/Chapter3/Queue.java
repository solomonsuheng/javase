package CareerCup.Chapter3;

/**
 * Created by Suheng on 15/5/3.
 */
public class Queue {
    Node first, last = null;

    public void enqueue(int data) {
        if (first == null) {
            Node temp = new Node(data);
            temp.next = null;
            first = temp;
            last = temp;
        } else {
            Node temp = new Node(data);
            temp.next = null;
            last.next = temp;
            last = last.next;
        }
    }

    public Node dequeue() {
        if (first == null) {
            return null;
        } else {
            Node resultNode = first;
            first = first.next;
            return resultNode;
        }
    }
}
