/**
 * MyStack represents a stack data structure.
 * It is implemented using a MyList for storing elements.
 *
 * @param <T> the type of elements in the stack
 */
public class MyStack<T> {

    private MyList<T> list;

    /**
     * Constructs a new MyStack with the specified MyList.
     *
     * @param list the MyList to be used as the underlying storage for the stack
     */
    public MyStack(MyList<T> list) {
        this.list = list;
    }

    /**
     * Pushes an element onto the top of the stack.
     *
     * @param item the element to be pushed onto the stack
     */
    public void push(T item) {
        list.add(item);
    }

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element removed from the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T last = list.getLast(); // Get the last element
        list.removeLast(); // Remove the last element
        return last; // Return the last element
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack
     */
    public int size() {
        return list.size();
    }
}

