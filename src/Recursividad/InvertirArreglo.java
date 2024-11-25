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

public class InvertirArreglo {
    public static void reverseArray(int[] data, int low, int high){
        if(low < high){
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high -1);
        }
    }
}
