package DataStructuresAndAlgorithmAnalysisinJava.Chapter_4;

/**
 * Created by Suheng on 6/28/15.
 */
public class TestBinaryTreee {
    public static void main(String[] args) {
        BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
        t.insert(10);
        t.insert(1);
        t.insert(4);
        t.insert(15);
        t.insert(18);

        t.LastOrder(t.root);

    }

    public static void preOrder(BinaryNode t) {
        System.out.println(t.element + " ");
        if (t.left != null) {
            preOrder(t.left);
        }

        if (t.right != null) {
            preOrder(t.right);
        }
    }
}
