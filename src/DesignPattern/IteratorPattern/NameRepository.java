package DesignPattern.IteratorPattern;

/**
 * Created by Suheng on 15/5/7.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }

            return null;
        }
    }
}
