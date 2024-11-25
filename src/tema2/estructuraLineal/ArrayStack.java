package tema2.estructuraLineal;

public class ArrayStack<E> implements stacks<E> {

    public static final int CAPACITY = 1000;// default array capacity {

    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public ArrayStack() {
        this(CAPACITY);
    } // constructs stack with default capacity

    public ArrayStack(int capacity) { // constructs stack with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    public int size() {
        return (t + 1);
    }

    public boolean isEmpty() {
        return (t == - 1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("Stack is full");
        }
        data[++t] = e;
    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
