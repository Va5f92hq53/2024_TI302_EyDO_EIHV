package tema2.estructuraLineal;

public class LinkendStack<E> implements stacks<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkendStack() {
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.IsEmpty();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E top() {
        return list.first();
    }

    public E pop() {
        return list.removeFirst();
    }
}
