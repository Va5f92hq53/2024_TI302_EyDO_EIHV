package T1Fundamentos;

import java.util.Random;
import java.util.Scanner;

public class EDAlgoTP02 {

    public void tareaA() {
        //MOSTRAR EL VALOR DEL ELEMENTO 6
        int[] f = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Elemento 5: " + f[6]);
    }

    public void tareaB() {
        //INICIAR CON 8 CADA UNO DE LOS 5 ELEMENTOS DEL ARREGLO 
        int[] g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = 8;
        }
        for (int i = 0; i < g.length; i++) {
            System.out.println("Elemento: " + g[i]);
        }
    }

    public void tareaC() {
        //SUMA TOTAL DE LOS ELEMENTOS DEL ARREGLO 
        double[] h = new double[100];
        double suma = 0;
        //DAR VALORES AL ARREGLO
        for (int i = 0; i < h.length; i++) {
            h[i] = i + 1;
        }
        for (int i = 0; i < h.length; i++) {
            suma += h[i];
        }
        System.out.println(suma);
    }

    public void tareaD() {
        //SE DECLARA EL PRIMER ARREGLO Y SE LE ASIGNA VALOR
        int[] a = new int[11];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }
        //RECORRE EL ARREGLO A Y CEDE SUS VALORES AL ARREGLO B
        //COPIAR ELEMENTOS DE "A" A "B"
        int[] b = new int[34];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }

    public void tareaE() {

        //IMPRIRMIR VALORES MAYOR Y MENOR
        double[] w = new double[99];
        for (int i = 0; i < w.length; i++) {
            w[i] = i + 1;
        }
        //INICIALIZAR VALORES PARA MENOR Y MAYOR
        double numMayor = w[0];
        double numMenor = w[0];
        for (int i = 0; i < w.length; i++) {
            if (w[i] > numMayor) {
                numMayor = w[i];
            } else {
                numMenor = w[i];
            }
        }
        System.out.println("Numeros mayores: " + numMayor);
        System.out.println("Numeros menores: " + numMenor);
    }

    public void E3() {
        //INCISO A
        System.out.println("Asignar cero a los elementos del arreglo cuenta");
        int[] cuentas = new int[10];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 0;
            System.out.print(cuentas[i] + " ");
        }
        System.out.println();

        //INCISO B
        System.out.println("Sumar 1 a los 15 elemntos del arreglo");
        int[] bono = new int[15];
        for (int i = 0; i < bono.length; i++) {
            bono[i] += 1;
            System.out.print(bono[i] + " ");
        }
        System.out.println();

        //INCISO C
        System.out.println("Imprimir los valores del arreglo en formato columna");
        int[] mejoresPuntuaciones = {85, 90, 97, 100, 86};
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.println(mejoresPuntuaciones[i] + " ");
        }
        //7.11
        System.out.println("ELIMINACION DE DUPLICADOS");
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros (entre 10 y 100)");

        int[] arreglo = new int[5];
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println("Ingresa un numero " + i);
//            int numero = Integer.parseInt(consola.nextLine());
//            if(numero >= 10 && numero <= 100)
//                }
    }

    public void E4() {

        System.out.println("***TIRO DE DADOS***");
        Random random = new Random();
        int[] tiros = new int[13];

        for (int i = 0; i < 36000000; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;
            tiros[suma]++;
        }
        System.out.printf("%-10s%-10s%n", "Suma", "Frecuencia");
        for (int i = 2; i < tiros.length; i++) {
            System.out.println("Suma " + i + ": " + tiros[i]);
        }
    }
    
    
}
