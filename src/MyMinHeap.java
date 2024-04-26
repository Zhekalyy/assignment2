public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap(MyList<T> list) {
        this.list = list;
        buildHeap();
    }

    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

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

    public T findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    private void buildHeap() {
        for (int i = (list.size() / 2) - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && list.get(index).compareTo(list.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

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

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
