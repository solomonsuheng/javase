package CareerCup.Chapter2;

/**
 * Created by Suheng on 15/5/1.
 */

public class Test {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        Node head = initNode(num);
        printNode(head);
        System.out.println();
        printNodeReverse(head);
    }

    //init the node by given num and return the head of the node
    public static Node initNode(int[] num) {
        if (num.length <= 0) {
            return null;
        }

        Node head = new Node(num[0]);
        Node point = head;

        for (int i = 1; i < num.length; i++) {
            Node temp = new Node(num[i]);
            point.next = temp;
            point = point.next;
        }
        point.next = null;
        return head;
    }

    //print node by order
    public static void printNode(Node head) {
        Node p = head;
        while (p.next != null) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.print(p.data);
    }

    //print node by reverse order
    public static void printNodeReverse(Node head) {
        if (head.next!= null) {
            printNodeReverse(head.next);
            System.out.print(head.data + "->");
        } else {
            System.out.print(head.data + "->");
        }
    }

}
