package T1Fundamentos;

import java.util.Scanner;

public class EliminacionDeDuplicados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int contador = 0; 

        //Pedir al usuario 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce 10 numeros entre 10 y 100:");
            int numero = scanner.nextInt();
            boolean numDuplicado = false;

            // Verificar si el número ya está en el arreglo
            for (int j = 0; j < contador; j++) {
                if (numeros[j] == numero) {
                    numDuplicado = true;
                    break;
                }
            }
            // Si no es duplicado se agregarlo
            if (!numDuplicado) {
                numeros[contador] = numero;
                contador++;

                // Mostrar los números que se encuentran
                for (int j = 0; j < contador; j++) {
                    System.out.print(numeros[j] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Número duplicado: " + numero);
                break;
            }
        }
    }
}
