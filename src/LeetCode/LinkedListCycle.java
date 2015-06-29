package LeetCode;

/**
 * Created by Suheng on 6/27/15.
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = initListNode(1, 2, 3, 4, 5, 6);
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head.next == head) {
            return true;
        }
        if (head.next == null) {
            return false;
        }


        ListNode point1 = head;
        ListNode point2 = head.next;

        while (point2 != null) {
            if (point2.next == point1 && point2 != null) {
                return true;
            }

            point1 = point1.next;
            if (point2.next == null || point2.next.next == null) {
                break;
            }
            point2 = point2.next.next;
        }


        return false;
    }

    private static void printNodeByHead(ListNode head) {
        ListNode pointNode = head;
        while (pointNode != null) {
            System.out.print(pointNode.val + "->");
            pointNode = pointNode.next;
        }

        System.out.println("null");

    }

    public static ListNode initListNode(int... nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode pointNode = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode newNode = new ListNode(nums[i]);
            pointNode.next = newNode;
            pointNode = pointNode.next;
        }
        return head;
    }
}
