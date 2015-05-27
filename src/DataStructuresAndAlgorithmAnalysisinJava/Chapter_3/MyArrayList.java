package DataStructuresAndAlgorithmAnalysisinJava.Chapter_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Suheng on 5/27/15.
 */
public class MyArrayList<AnyType> implements Iterable<AnyType> {
    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private AnyType[] theItems;

    public MyArrayList() {
        clear();
    }

    private void clear() {
        this.theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size() {
        return this.theSize;
    }

    public boolean isEmpty() {
        return this.size() == 0;//判断是否为空
    }

    public void trimToSize() {
        this.ensureCapacity(this.size());
    }


    public AnyType get(int idx) {
        if (idx < 0 || idx >= this.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.theItems[idx];
    }


    public boolean add(AnyType x) {
        add(this.size(), x);
        return true;
    }

    public void add(int idx, AnyType x) {
        if (this.theItems.length == this.size()) {
            this.ensureCapacity(this.size() * 2 + 1);
        }
        for (int i = this.theSize; i > idx; i--) {
            this.theItems[i] = this.theItems[i - 1];//向右移动
        }

        this.theItems[idx] = x;
        this.theSize++;
    }

    public AnyType remove(int idx) {
        AnyType removeItem = this.theItems[idx];
        for (int i = idx; i < this.size() - 1; i++) {
            this.theItems[i] = this.theItems[i + 1];//向左移动
        }
        this.theSize--;
        return removeItem;
    }

    public Iterator<AnyType> iterator() {
        return new ArrayListIterator();
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity < this.theSize) {
            return;
        }

        AnyType[] old = this.theItems;
        this.theItems = (AnyType[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            this.theItems[i] = old[i];
        }
    }

    //内部类
    private class ArrayListIterator implements Iterator<AnyType> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return this.current < size();
        }

        @Override
        public AnyType next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return theItems[this.current++];
        }

        public void remove() {
            MyArrayList.this.remove(--this.current);
        }
    }

}
