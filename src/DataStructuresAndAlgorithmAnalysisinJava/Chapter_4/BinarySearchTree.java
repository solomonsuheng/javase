package DataStructuresAndAlgorithmAnalysisinJava.Chapter_4;

/**
 * Created by Suheng on 6/28/15.
 */
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    public BinaryNode<AnyType> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void insert(AnyType x) {
        this.root = insert(x, this.root);
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> root) {
        if (root == null) {
            //不存在根节点，将传进来的作为跟节点并且返回
            return new BinaryNode<AnyType>(x, null, null);
        }
        //让x于根节点进行比较
        int compareResult = x.compareTo(root.element);

        if (compareResult < 0) {
            root.left = insert(x, root.left);
        } else if (compareResult > 0) {
            root.right = insert(x, root.right);
        } else {

        }
        return root;
    }

    public void PreOrder(BinaryNode t) {
        System.out.println(t.element + " ");
        if (t.left != null) {
            this.PreOrder(t.left);
        }
        if (t.right != null) {
            this.PreOrder(t.right);
        }
    }


    public void LastOrder(BinaryNode t) {

        if (t.left != null) {
            this.PreOrder(t.left);
        }
        System.out.println(t.element + " ");
        if (t.right != null) {
            this.PreOrder(t.right);
        }
    }
}
