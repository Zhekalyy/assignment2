/**
 * MyMinHeap represents a min-heap data structure.
 * It is implemented using a MyList for storing elements.
 *
 * @param <T> the type of elements in the heap, must extend Comparable
 */
public class MyMinHeap<T extends Comparable<T>> {

    private MyList<T> list;

    /**
     * Constructs a new MyMinHeap with the specified MyList.
     * Initializes the heap by building it.
     *
     * @param list the MyList to be used as the underlying storage for the heap
     */
    public MyMinHeap(MyList<T> list) {
        this.list = list;
        buildHeap();
    }

    /**
     * Inserts a new element into the heap.
     * Adjusts the heap property by moving the new element up if necessary.
     *
     * @param item the element to be inserted into the heap
     */
    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

    /**
     * Deletes and returns the minimum element from the heap.
     * Adjusts the heap property by moving the last element to the root and then heapifying down.
     *
     * @return the minimum element from the heap
     * @throws IllegalStateException if the heap is empty
     */
    public T deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = findMin();
        T last = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if (!isEmpty()) {
            list.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    /**
     * Returns the minimum element from the heap without removing it.
     *
     * @return the minimum element from the heap
     * @throws IllegalStateException if the heap is empty
     */
    public T findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return list.get(0);
    }

    /**
     * Checks if the heap is empty.
     *
     * @return true if the heap is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the number of elements in the heap.
     *
     * @return the number of elements in the heap
     */
    public int size() {
        return list.size();
    }

    // Builds the heap by performing heapify down on all non-leaf nodes
    private void buildHeap() {
        for (int i = (list.size() / 2) - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    // Restores the heap property by moving the element up
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && list.get(index).compareTo(list.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Restores the heap property by moving the element down
    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestIndex = index;
        if (leftChildIndex < list.size() && list.get(leftChildIndex).compareTo(list.get(smallestIndex)) < 0) {
            smallestIndex = leftChildIndex;
        }
        if (rightChildIndex < list.size() && list.get(rightChildIndex).compareTo(list.get(smallestIndex)) < 0) {
            smallestIndex = rightChildIndex;
        }
        if (smallestIndex != index) {
            swap(index, smallestIndex);
            heapifyDown(smallestIndex);
        }
    }

    // Swaps two elements in the list
    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
