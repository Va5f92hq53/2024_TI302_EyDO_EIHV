/*
pag 127, terminar el codigo
 */
package tema2.estructuraLineal;

public class SinglyLinkedList<E> {

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

    private node<E> head;
    private node<E> tail;
    private int size;

    public SinglyLinkedList() {
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
        return head.getElement();
    }

    public E last() {
        if (IsEmpty()) {
            return null;
        }
        return tail.getElement();
    }
    
    public void addFirst ( E e){
        head = new node<E> (e, head);
        if(size == 0) tail = head;
        size++;
    }

    public void addLast(E e) {
        node<E> newest = new node<E>(e, null);
        if (IsEmpty()) head = newest;
        else 
            tail.setNext(newest);
            size = size + 1;
        
    }

    public E removeFirst() {
        if (IsEmpty()) return null;
            E answer = head.getElement();
            size--;
            if (size == 0) tail = null;
                
            return answer;
    }
    
    }