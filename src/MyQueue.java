public class MyQueue<T> {
    private MyList<T> list;

    public MyQueue(MyList<T> list) {
        this.list = list;
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        list.removeFirst(); // Удаляем элемент из списка
        return list.getFirst(); // Возвращаем первый элемент
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
