package T3EstructuraNoLineal;

import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteratorSimple implements IteradorExample<E> {

    private int j = 0;
    private boolean removable = false;
    private int size;

    public boolean hasNext() {
        return j < size;
    }

    public E next() throws NoSuchElementException {
        if (j == size) {
            throw NoSuchElementException("No next element");
        }
        removable = true;
        return data[j++];
    }

    public void remove() throws IllegalStateException {
        if (!removable) {
            throw new IllegalStateException("nothing to remove");
        }
        ArrayList.this.remove(j - 1);
        j--;
        removable = false;
    }

    private Exception NoSuchElementException(String no_next_element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
