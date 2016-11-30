package SixthExercise;


import java.util.Iterator;

/**
 * Created by Admin on 22.11.2016.
 */
public class MyLinkedList<E> implements ILinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public void add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.nextNode = newNode;
        size++;
    }

    public void add(int index, E element) {
        if (index == size) {
            Node<E> pr = last;
            final Node<E> newNode = new Node<>(pr, element, null);
            last = newNode;
            if (pr == null)
                first = newNode;
            else
                pr.nextNode = newNode;
            size++;
        } else {
            Node<E> x = node(index);
            Node<E> pred = x.prevNode;
            Node<E> newNode = new Node<>(pred, element, x);
            x.prevNode = newNode;
            if (pred == null)
                first = newNode;
            else
                pred.nextNode = newNode;
            size++;
        }
    }

    public E get(int index) {
        return node(index).element;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.nextNode;
            x.element = null;
            x.nextNode = null;
            x.prevNode = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public E remove(int index) {
        Node<E> x = node(index);
        E element = x.element;
        Node<E> next = x.nextNode;
        Node<E> prev = x.prevNode;

        if (prev == null) {
            first = next;
        } else {
            prev.nextNode = next;
            x.prevNode = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prevNode = prev;
            x.nextNode = null;
        }

        x.element = null;
        size--;
        return element;
    }

    public E set(int index, E element) {
        Node<E> x = node(index);
        E oldValue = x.element;
        x.element = element;
        return oldValue;
    }

    private Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.nextNode;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prevNode;
            return x;
        }
    }

    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }


     public Iterator<E> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {

        int cursor = 0;

        int lastRet = -1;

        public boolean hasNext() {
            return cursor != size();
        }

        public E next() {
            int i = cursor;
            E next = get(i);
            lastRet = i;
            cursor = i + 1;
            return next;
        }
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.nextNode)
            result[i++] = x.element;
        return result;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }


}
