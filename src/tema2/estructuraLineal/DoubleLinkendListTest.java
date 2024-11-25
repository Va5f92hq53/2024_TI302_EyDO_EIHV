
package tema2.estructuraLineal;

public class DoubleLinkendListTest {
    public static void main(String[] args) {
        DoubleLinkendList<String> dll = new DoubleLinkendList<>();
        test1();
        test2();
    }
    
    public static void test1(){
        DoubleLinkendList<String> dll = new DoubleLinkendList<>();
        dll.addFirst("A");
        dll.addFirst("B");
        dll.addFirst("C");
        dll.addFirst("D");
        
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
    }
    
    public static void test2(){
        DoubleLinkendList<String> dll = new DoubleLinkendList<>();
        dll.addLast("A");
        dll.addFirst("B");
        dll.addLast("C");
        dll.addLast("D");
        
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
        System.out.println(dll.removeFirts());
    }
}
