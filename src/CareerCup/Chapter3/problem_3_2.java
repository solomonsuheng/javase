package CareerCup.Chapter3;

/**
 * Created by Suheng on 15/5/4.
 */

import java.util.HashSet;

/**
 * has a function min which returns the minimum element
 */
public class problem_3_2 {

    public static void main(String[] args) {
        Node top = new Node(0);
        StackWithMin s = new StackWithMin(top);
        for (int i = 0; i < 10; i++) {
            s.push((int) (Math.random() * 10));
        }
        System.out.println(s);
        System.out.println(s.pop().data);
        System.out.println("The min is :" + s.min.data);
    }

    //inner stack class, which has a function
    static class StackWithMin {
        Node top = null;
        Node min = new Node(Integer.MAX_VALUE);
        HashSet<Integer> hashSet = new HashSet<Integer>();

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            Node topPointer = top;
            while (topPointer != null) {
                sb.append(topPointer.data + "->");
                topPointer = topPointer.next;
            }

            sb.append("null");
            return sb.toString();
        }

        public Node pop() {
            if (top != null) {
                return top;
            } else {
                return null;
            }
        }

        public StackWithMin(Node top) {
            this.top = top;
        }

        public void push(int data) {
            if (!hashSet.contains(data)) {
                if (data < min.data) {
                    min.data = data;
                }
            }
            Node tempNode = new Node(data);
            tempNode.next = top;
            top = tempNode;
        }
    }


}
