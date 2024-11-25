/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3EstructuraNoLineal;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorExample {

    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        data.add(3.5);
        data.add(1.2);
        data.add(-4.6);
        data.add(0.5);
        data.add(2.6);
        
        System.out.println(data);
        
        Iterator<Double> walk = data.iterator();
        while (walk.hasNext()) {
            if (walk.next() < 0.0) {
                walk.remove();
            }
        }
        System.out.println(data);
//pag 285. copiar el codigo, clase ArrayIteratorSimple
    }
}
