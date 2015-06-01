package DataStructuresAndAlgorithmAnalysisinJava.Chapter_3;

/**
 * Created by Suheng on 6/1/15.
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType> {
    //数据域
    private int theSize;
    private int modCount = 0;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;

    //私有嵌套类结点
    private static class Node<AnyType> {
        public AnyType data;
        public Node<AnyType> prev;
        public Node<AnyType> next;

        //构造函数
        public Node(AnyType data, Node<AnyType> prev, Node<AnyType> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    //构造函数
    public MyLinkedList() {
        clear();
    }

    public void clear() {
        this.beginMarker = new Node<AnyType>(null, null, null);
        this.endMarker = new Node<AnyType>(null, this.beginMarker, null);
        this.beginMarker.next = this.endMarker;
        this.theSize = 0;
        this.modCount++;
    }

    public int size() {
        return this.theSize;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }


    public boolean add(AnyType x) {
        add(this.size(), x);
        return true;
    }

    public void add(int idx, AnyType x) {
        addBefore(this.getNode(idx), x);
    }

    public AnyType get(int idx) {
        return this.getNode(idx).data;
    }

    public AnyType set(int idx, AnyType newVal) {
        Node<AnyType> p = this.getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }


    public AnyType remove(int idx) {
        return this.remove(this.getNode(idx));
    }


    /**
     * Removes the obejct contained in Node p.
     */
    public AnyType remove(Node<AnyType> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        this.theSize--;
        this.modCount++;

        return p.data;
    }

    public java.util.Iterator<AnyType> iterator() {
        return new LinkedListIterator();
    }


    /**
     * LinkedListIterator具有类似ArrayListIterator的逻辑,合并了重要的错误检测
     */
    private class LinkedListIterator implements java.util.Iterator<AnyType> {
        private Node<AnyType> current = beginMarker.next;
        private int exceptedModCount = modCount;
        private boolean okToRemove = false;


        @Override
        public boolean hasNext() {
            return this.current != endMarker;
        }

        @Override
        public AnyType next() {
            if (modCount != this.exceptedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!this.hasNext()) {
                throw new java.util.NoSuchElementException();
            }

            AnyType newItem = this.current.data;
            this.current = this.current.next;
            this.okToRemove = true;
            return newItem;
        }

        @Override
        public void remove() {
            if (modCount != this.exceptedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!okToRemove) {
                throw new IllegalStateException();
            }

            MyLinkedList.this.remove(this.current.prev);
            this.okToRemove = false;
            this.exceptedModCount++;
        }
    }

    /**
     * 根据指定的位置获取元素，范围为0到size()的大小
     */
    private Node<AnyType> getNode(int idx) {
        Node<AnyType> p;
        if (idx < 0 || idx > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        //判断是位置的大小来进行折半
        if (idx < this.size() / 2) {
            p = this.beginMarker.next;
            for (int i = 0; i < idx; i++) {
                p = p.next;
            }
        } else {
            p = this.endMarker;
            for (int i = this.size(); i > idx; i--) {
                p = p.prev;
            }
        }

        return p;
    }

    /**
     * 向集合中添加项，在指定的位置
     * 项加入后，位置滑块自动增高一位
     */
    private void addBefore(Node<AnyType> p, AnyType x) {
        //创建新的结点
        Node<AnyType> newNode = new Node<AnyType>(x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        this.theSize++;
        this.modCount++;
    }


    public static void main(String[] args) {

    }
}
