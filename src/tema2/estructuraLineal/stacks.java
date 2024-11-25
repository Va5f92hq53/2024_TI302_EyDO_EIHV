/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tema2.estructuraLineal;

/**
 *
 * @author Gateway
 */
public interface stacks <E>{
    public int size(); //Regresa el numero del stack

    /**
     * True si esta vacio y False si no esta vacio
     *
     * @return
     */

    public boolean isEmpty();

    /**
     * Agrega datos al stack
     */

    public void push(E e);

    /**
     * Elimina un dato de la fila
     *
     * @return
     */

    public E pop();

    /**
     * Regresa pero no elimina el elemento superior de la fila y si no no
     * encuetra nada se pone null
     *
     * @return
     */

    public E top();


}
