/**
 * MyLinkedList<T> is an implementation of the MyList interface using a doubly linked list to store elements.
 *
 * @param <T> the type of elements stored in the linked list
 */
import java.util.Iterator;
public class MyLinkedList<T> implements MyList<T> {

    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        public MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    /**
     * Constructs an empty linked list.
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        MyNode node = getNodeAtIndex(index);
        node.data = item;
    }

    @Override
    public void add(int index, T item) {
        // Check if index is out of bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Check if index is at the beginning or end of the list
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            // Insert at specified index
            MyNode current = getNodeAtIndex(index);
            MyNode newNode = new MyNode(item);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        // Check if list is empty
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Insert at the beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        // Check if list is empty
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            // Insert at the end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        return getNodeAtIndex(index).data;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return tail.data;
    }

    @Override
    public void remove(int index) {
        MyNode nodeToRemove = getNodeAtIndex(index);
        // Check if node to remove is at the beginning or end of the list
        if (nodeToRemove == head) {
            removeFirst();
        } else if (nodeToRemove == tail) {
            removeLast();
        } else {
            // Remove from the middle
            nodeToRemove.prev.next = nodeToRemove.next;
            nodeToRemove.next.prev = nodeToRemove.prev;
            size--;
        }
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        // Remove the first node
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        // Check if list contains only one node
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            // Remove the last node
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    @Override
    public void sort() {
        throw new UnsupportedOperationException("Sorting is not supported for linked list");
    }

    @Override
    public int indexOf(Object object) {
        MyNode current = head;
        int index = 0;
        // Traverse the list to find the index of the object
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode current = tail;
        int index = size - 1;
        // Traverse the list backwards to find the last index of the object
        while (current != null) {
            if (current.data.equals(object)) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        MyNode current = head;
        int index = 0;
        // Copy elements to array
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        };
    }

    private MyNode getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        MyNode current = head;
        // Traverse the list to find the node at the specified index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

}
