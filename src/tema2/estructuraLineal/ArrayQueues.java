package tema2.estructuraLineal;

import static tema2.estructuraLineal.ArrayStack.CAPACITY;

public class ArrayQueues<E> implements Queue<E> {

    private E[] data;
    private int f = 0;
    private int sz = 0;

    public ArrayQueues() {
        this(CAPACITY);
    }

    public ArrayQueues(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return (sz == 0);
    }

    public void enqueue(E e) throws IllegalStateException {
        if (sz == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        int avail = (f + sz) % data.length;
        data[avail] = e;
        sz++;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return data[f];
    }

    public E deduque() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[f];
        data[f] = null;
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }

    @Override
    public E dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
