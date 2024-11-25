package tema2.estructuraLineal;

public class CirculartyLinkendList<E> {

    private static class node<E> {

        private E element;
        private node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }

    }

    private node<E> tail;
    private int size;

    public CirculartyLinkendList() {
    }

    public int size() {
        return size;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public E first() {
        if (IsEmpty()) {
            return null;
        }
        return tail.getNext().element;
    }

    public E last() {
        if (IsEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new node<>(e, null);
            tail.setNext(tail);
        } else {
            node<E> newest = new node<>(e, tail.getNext());
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (IsEmpty()) {
            return null;
        }
        node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }

        size--;
        return head.getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }
    
    
    
}
