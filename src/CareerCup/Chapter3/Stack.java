package CareerCup.Chapter3;

/**
 * Created by Suheng on 15/5/3.
 */

/**
 * Stack data Structure
 */

public class Stack {
    Node top = null;

    public Node pop() {
        if (top != null) {
            return top;
        } else {
            return null;
        }
    }

    public Stack(Node top) {
        this.top = top;
    }

    public void push(int data) {
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
    }

}
