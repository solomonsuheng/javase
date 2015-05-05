package CareerCup.Chapter4;

/**
 * Created by Suheng on 15/5/4.
 */
public class Test {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        TreeNode root = initNode(str);//init the tree by string
        printPreOrder(root);
    }


    //pre-order print
    private static void printPreOrder(TreeNode root) {
        if (root.left != null) {
            printPreOrder(root.left);
            System.out.println(root.data);
        }else if(root.right!=null){
            printPreOrder(root.right);
            System.out.println(root.data);
        }


    }

    //init the tree node
    private static TreeNode initNode(String str) {
        if (str.length() <= 0) {
            return null;
        }
        TreeNode root = new TreeNode(str.charAt(0));
        TreeNode pointRoot = root;//a pointer to init ohters
        for (int i = 1; i < str.length(); i++) {
            if (pointRoot.left == null) {
                TreeNode temp = new TreeNode(str.charAt(i));
                pointRoot.left = temp;
            } else if (pointRoot.right == null) {
                TreeNode temp = new TreeNode(str.charAt(i));
                pointRoot.right = temp;
            } else {
                pointRoot = pointRoot.left;
            }
        }

        return root;
    }
}
