package CareerCup.Chapter3;

/**
 * Created by Suheng on 15/5/4.
 */

/**
 * Describe how you could use a single array to implement three stacks.
 */
public class problem_3_1 {
    //the way to use a single array to implement three stacks
    public static int[] numArray = new int[30];//every stack has 10 size
    public static int startPoint = 0;//the first stack's pointer
    public static int endPoint = numArray.length;//the second stack's pointer
    public static int thirdPoint = numArray.length / 3;//the third pointer

    public static void main(String[] args) {
        //test stack 1;
        testStack1();
    }

    //the method to test stack 1
    private static void testStack1() {
        //push element to stack;
        for (int i = 0; i < 10; i++) {
            stack1Push((i + 1));
        }

        //pop element from stack;
        for (int i = 0; i < 10; i++) {
            System.out.print(stack1PoP() + ",");
        }

    }

    //first stack's push
    public static boolean stack1Push(int data) {
        //check the size of stack
        if (startPoint == 10) {
            System.out.println("The stack is full");
            return false;
        } else {
            numArray[startPoint++] = data;
            return true;
        }
    }


    // first stack's pop
    public static int stack1PoP() {
        if (startPoint == 0) {
            //there is no element in the stack
            System.out.println("there is no element in the stack");
            return -1;
        } else {
            return numArray[--startPoint];
        }

    }


    //same to the others

}
