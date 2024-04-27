public class MyStack<T> {
    private MyList<T> list;
    public MyStack(MyList<T> list) {
        this.list = list;
    }
    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T last = list.getLast(); 
        list.removeLast(); 
        return last;
    }


    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}

