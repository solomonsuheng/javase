package Rosettacode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Suheng on 15/5/5.
 */
public class TreeTraverse {
    //This is the tree node
    private static class Node<T> {
        public Node<T> left;//pointer to the left children
        public Node<T> right;//pointer to the right children
        public T data;//the data of this node

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        //preorder the tree
        public static void preorder(Node<?> n) {
            if (n != null) {
                System.out.print(n.data + " ");
                preorder(n.getLeft());
                preorder(n.getRight());
            }
        }

        //inorder the tree
        public static void inorder(Node<?> n) {
            if (n != null) {
                inorder(n.getLeft());
                System.out.print(n.data + " ");
                inorder(n.getRight());
            }
        }

        //postorder the tree
        public static void postorder(Node<?> n) {
            if (n != null) {
                postorder(n.getLeft());
                postorder(n.getRight());
                System.out.print(n.data + " ");
            }
        }

        public static void levelorder(Node<?> n) {
            Queue<Node<?>> nodeQueue = new LinkedList<Node<?>>();
            if (n != null) {
                nodeQueue.add(n);
            }
            while (!nodeQueue.isEmpty()) {
                Node<?> next = nodeQueue.remove();
                System.out.print(next.data + " ");
                if (next.getLeft() != null) {
                    nodeQueue.add(next.getLeft());
                }
                if (next.getRight() != null) {
                    nodeQueue.add(next.getRight());
                }
            }
        }

        public static void main(String[] args) {
            Node<Integer> one = new Node<Integer>(1);
            Node<Integer> two = new Node<Integer>(2);
            Node<Integer> three = new Node<Integer>(3);
            Node<Integer> four = new Node<Integer>(4);
            Node<Integer> five = new Node<Integer>(5);
            Node<Integer> six = new Node<Integer>(6);
            Node<Integer> seven = new Node<Integer>(7);
            Node<Integer> eight = new Node<Integer>(8);
            Node<Integer> nine = new Node<Integer>(9);
            one.setLeft(two);
            one.setRight(three);
            two.setLeft(four);
            two.setRight(five);
            three.setLeft(six);
            four.setLeft(seven);
            six.setLeft(eight);
            six.setRight(nine);

            preorder(one);
            System.out.println();
            inorder(one);
            System.out.println();
            postorder(one);
            System.out.println();
            levelorder(one);
            System.out.println();
        }
    }
}
