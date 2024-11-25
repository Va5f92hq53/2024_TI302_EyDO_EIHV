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

public class PruebaTest {
    public static void main(String[] args) {
        // Ejemplo 1
        int[] arr1 = {1, 2, 3, 4, 5};
        int resultado1 = Suma.linearSum(arr1, 3);
        System.out.println("Suma de los tres primeros numeros del arreglo: " + resultado1);
        System.out.println();
        
        int[] arr2 = {5, 10, 15, 20, 25};
        int resultado2 = Suma.linearSum(arr2, 5);
        System.out.println("Suma de los 5 numeros del arreglo: " + resultado2);
        System.out.println();
        
        int[] arr3 = {10, 20, 30, 40, 50};
        int resultado3 = Suma.linearSum(arr3, 4);
        System.out.println("Suma de los 4 primeros numeros del arreglo: " + resultado3);
    }
}
