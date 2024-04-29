/**
 * MyList is an interface that defines basic operations for a list data structure.
 * It provides methods for adding, removing, and accessing elements in the list.
 *
 * @param <T> the type of elements stored in the list
 */
public interface MyList<T> extends Iterable<T> {

    /**
     * Adds an element to the end of the list.
     *
     * @param item the element to be added to the list
     */
    void add(T item);

    /**
     * Sets the element at the specified index to the given item.
     *
     * @param index the index at which to set the element
     * @param item  the new value of the element at the specified index
     */
    void set(int index, T item);

    /**
     * Inserts the specified element at the specified position in the list.
     *
     * @param index the index at which to insert the element
     * @param item  the element to be inserted into the list
     */
    void add(int index, T item);

    /**
     * Adds the specified element to the beginning of the list.
     *
     * @param item the element to be added to the beginning of the list
     */
    void addFirst(T item);

    /**
     * Adds the specified element to the end of the list.
     *
     * @param item the element to be added to the end of the list
     */
    void addLast(T item);

    /**
     * Returns the element at the specified index in the list.
     *
     * @param index the index of the element to return
     * @return the element at the specified index
     */
    T get(int index);

    /**
     * Returns the first element in the list.
     *
     * @return the first element in the list
     */
    T getFirst();

    /**
     * Returns the last element in the list.
     *
     * @return the last element in the list
     */
    T getLast();

    /**
     * Removes the element at the specified index from the list.
     *
     * @param index the index of the element to be removed
     */
    void remove(int index);

    /**
     * Removes the first element from the list.
     */
    void removeFirst();

    /**
     * Removes the last element from the list.
     */
    void removeLast();

    /**
     * Sorts the elements in the list.
     */
    void sort();

    /**
     * Returns the index of the first occurrence of the specified element in the list.
     *
     * @param object the element to search for
     * @return the index of the first occurrence of the element, or -1 if not found
     */
    int indexOf(Object object);

    /**
     * Returns the index of the last occurrence of the specified element in the list.
     *
     * @param object the element to search for
     * @return the index of the last occurrence of the element, or -1 if not found
     */
    int lastIndexOf(Object object);

    /**
     * Checks whether the specified element is present in the list.
     *
     * @param object the element to check for
     * @return true if the element is present, false otherwise
     */
    boolean exists(Object object);

    /**
     * Returns an array containing all of the elements in the list.
     *
     * @return an array containing all of the elements in the list
     */
    Object[] toArray();

    /**
     * Removes all of the elements from the list.
     */
    void clear();

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list
     */
    int size();
}

