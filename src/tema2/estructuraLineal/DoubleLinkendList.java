package tema2.estructuraLineal;

public class DoubleLinkendList<E> {

    private static class Node<E> {

        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getelement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size;

    public DoubleLinkendList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public E first() {
        return header.getNext().getelement();
    }

    public E last() {
        return trailer.getPrev().getelement();
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> sucessor) {
        Node<E> newest = new Node<>(e, predecessor, sucessor);
        predecessor.setNext(newest);
        sucessor.setPrev(newest);
        size++;
    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> sucessor = node.getNext();
        
        node.setNext(null);
        node.setPrev(null);
        
        predecessor.setNext(sucessor);
        sucessor.setPrev(predecessor);



        size--;
        return node.getelement();
    }

    public E removeFirts() {
        if (isEmpty()) {
            return null;
        }
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getNext());
    }
}
