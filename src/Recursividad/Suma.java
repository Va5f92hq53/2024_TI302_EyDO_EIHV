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

public class Suma {
    public static int linearSum(int[] data, int n){
        if(n== 0)
            return 0;
        else
            return linearSum(data, n - 1) + data[n-1];
    }
}
