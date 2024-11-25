
package tema2.estructuraLineal;

import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        demoDouble();
    }
    
    public static void demoLibro(){
        ArrayList<Character> al = new ArrayList();
        al.add(0, 'A');
        al.add(0, 'B');
        System.out.println(al.get(1));
        try{
            al.set(2, 'c');
        }catch(IndexOutOfBoundsException ibe){
            System.out.println("Operation canos be done!!!");
        }
        al.add(2, 'c');
    }
    
    public static void demoDouble(){
        ArrayList<Double> al = new ArrayList<>();
        al.add(0,1.0);
        al.add(1,2.0);
        al.add(0,0.0);
        
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));
        System.out.println(al.remove(0));
        
        // iterator
        al.add(0,1.0);
        al.add(1,-2.0);
        al.add(0,0.0);
        
        System.out.println(al);
        Iterator<Double> walk = al.iterator();
        while (walk.hasNext( ))
            if (walk.next( ) < 0.0)
                walk.remove( );
        
        System.out.println(al);
    }
    
}
