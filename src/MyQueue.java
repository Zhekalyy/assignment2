/**
 * MyQueue represents a queue data structure.
 * It is implemented using a MyList for storing elements.
 *
 * @param <T> the type of elements in the queue
 */
public class MyQueue<T> {

    private MyList<T> list;

    /**
     * Constructs a new MyQueue with the specified MyList.
     *
     * @param list the MyList to be used as the underlying storage for the queue
     */
    public MyQueue(MyList<T> list) {
        this.list = list;
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param item the element to be added to the queue
     */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element removed from the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        list.removeFirst(); // Remove the element from the list
        return list.getFirst(); // Return the first element
    }

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return the element at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }
}
