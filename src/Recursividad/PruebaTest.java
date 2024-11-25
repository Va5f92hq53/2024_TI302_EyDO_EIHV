/*
ESTRUCTURA Y ORGANIZACION DE DATOS
Agosto - Diciembre 2024
UNIDAD 3
Tarea 1. Recursividad
Prof. Francisco Javier Montecillo Puente
Alumno 1: Hernandez Vigil Evelyn Iris 
Alumno 2: Duran Garcia Maria Isabel
25/11/2025
 */
package Recursividad;

import static Recursividad.InvertirArreglo.reverseArray;

public class PruebaTest {

    public static void main(String[] args) {
        
        int[] arreglo1 = {1, 2, 3, 4, 5};
        reverseArray(arreglo1, 0, arreglo1.length - 1);
        System.out.print("Ejemplo 1: ");
        imprimirArreglo(arreglo1); 

        int[] arreglo2 = {10, 20, 30, 40, 50};
        reverseArray(arreglo2, 1, 3);
        System.out.print("Ejemplo 2: ");
        imprimirArreglo(arreglo2); 

        int[] arreglo3 = {5, 4, 3, 2, 1};
        reverseArray(arreglo3, 0, arreglo3.length - 1);
        System.out.print("Ejemplo 3: ");
        imprimirArreglo(arreglo3); 
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
        
//        // Ejemplo 1
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int resultado1 = Suma.linearSum(arr1, 3);
//        System.out.println("Suma de los tres primeros numeros del arreglo: " + resultado1);
//        System.out.println();
//        
//        int[] arr2 = {5, 10, 15, 20, 25};
//        int resultado2 = Suma.linearSum(arr2, 5);
//        System.out.println("Suma de los 5 numeros del arreglo: " + resultado2);
//        System.out.println();
//        
//        int[] arr3 = {10, 20, 30, 40, 50};
//        int resultado3 = Suma.linearSum(arr3, 4);
//        System.out.println("Suma de los 4 primeros numeros del arreglo: " + resultado3);

        
    }
}
