package LeetCode;

/**
 * Created by Suheng on 6/26/15.
 */
public class AddTwoNumbers {
    public static void main(String[] args){
        ListNode list1 = initNode(2,4,3);
        ListNode list2 = initNode(5,6,4);
        printListNode(list1);
        printListNode(list2);
        ListNode result = addTwoNumbers(list1,list2);
        printListNode(result);
    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        if(l1==null||l2==null){
            return null;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode resultList = new ListNode(-1);
        ListNode resultPoint = resultList;
        int setup = 0;
        while(p1!=null&&p2!=null){
            int	temp = p1.val + p2.val + setup;
            setup = temp / 10;
            temp = temp % 10;

            ListNode newNode = new ListNode(temp);

            resultPoint.next = newNode;
            resultPoint = resultPoint.next;
            p1 = p1.next;
            p2 = p2.next;
        }


        //三种情况
        if(p1==null&&p2==null){
            if(setup!=0){
                ListNode newNode = new ListNode(setup);
                resultPoint.next = newNode;
            }
        }

        //p1 or p2 长
        if(p1!=null){
            //p1长
            goIt(p1,resultPoint,setup);
        }else if(p2!=null){
            goIt(p2,resultPoint,setup);
        }
        return resultList.next;
    }

    public static void goIt(ListNode p,ListNode resultPoint,int setup){
        while(p!=null){
            int temp = p.val + setup;
            setup = temp / 10;
            temp = temp % 10;
            ListNode newNode = new ListNode(temp);
            resultPoint.next = newNode;
            resultPoint = resultPoint.next;
            p = p.next;
        }
        if(setup!=0){
            ListNode newList = new ListNode(setup);
            resultPoint.next = newList;
        }
    }


    public static ListNode initNode(int... nums){
        if(nums.length==0){
            return null;
        }

        ListNode head = new ListNode(nums[0]);
        ListNode tempPoint = head;

        for(int i=1;i<nums.length;i++){
            ListNode temp = new ListNode(nums[i]);
            tempPoint.next = temp;
            tempPoint = tempPoint.next;
        }

        return head;
    }

    public static void printListNode(ListNode head){
        ListNode tempPointer = head;
        while(tempPointer!=null){
            System.out.print(tempPointer.val+"->");
            tempPointer = tempPointer.next;
        }
        System.out.println("null");
    }
}
