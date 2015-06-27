package LeetCode;

/**
 * Created by Suheng on 6/27/15.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = initListNode(1, 2, 3, 4, 5, 6);
        printNodeByHead(head);
        ListNode l = reverseList(head);
        printNodeByHead(l);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode nextNode = head.next;
        ListNode newNode = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newNode;
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
