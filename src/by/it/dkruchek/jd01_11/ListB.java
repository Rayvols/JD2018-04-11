package by.it.dkruchek.jd01_11;

import java.util.*;

/**
 * Created by Dmitriy.Kruchek on 5/15/2018.
 */
public class ListB<T> implements List<T> {

    private T[] array = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public boolean add(T element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 3 / 2 + 1);
        }
        array[size++] = element;
        return true;
    }

    @Override
    public T remove(int index) {
        T deleted = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1 );
        size--;
        return deleted;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            this.add(element);
        }
        return true;
    }

    @Override
    public T set(int index, T element) {
        if (index >= size) throw new IndexOutOfBoundsException();
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        this.add(null);
        System.arraycopy(array, index, array, index + 1,size - index);
        array[index] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            T element = array[i];
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

// Task B ---------------------------------------------------------------
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

     @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
