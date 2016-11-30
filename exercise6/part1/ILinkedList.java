package SixthExercise;

import java.util.Iterator;

/**
 * Created by Admin on 22.11.2016.
 */
public interface ILinkedList<E>  {
    void add(E element);
    void add(int index, E element);
    void clear();
    E get(int index);
    int indexOf(E element);
    E remove(int index);
    E set(int index, E element);
    int size();
    Object[] toArray();
    Iterator<E> iterator();
    String toString();
}
