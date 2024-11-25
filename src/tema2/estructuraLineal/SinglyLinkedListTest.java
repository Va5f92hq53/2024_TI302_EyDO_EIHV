package tema2.estructuraLineal;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        System.out.println("Size " + sll.size());
        System.out.println("Size " + sll.first());
        System.out.println("Size " + sll.last());

        sll.addFirst("Evelyn");

        System.out.println("Size" + sll.size());
        System.out.println("Size " + sll.first());
        System.out.println("Size " + sll.last());

        
        String dato = null;
        while ((dato = sll.removeFirst()) != null) 
          {
            System.out.println(dato + " ");
        }

    }
}
