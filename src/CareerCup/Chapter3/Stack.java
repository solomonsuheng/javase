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
            Node tempPointToTop = top;
            top = top.next;
            return tempPointToTop;
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


    public static void main(String[] args) {
        Node top = new Node(Integer.MAX_VALUE);
        Stack s = new Stack(top);
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(s.pop().data + " ");
        }
    }
}
