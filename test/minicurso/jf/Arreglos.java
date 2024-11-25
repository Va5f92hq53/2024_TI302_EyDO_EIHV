/*
PRACTICA DE ARREGLOS
Llenar fill0to9
ITESS-TICS
AGOSTO  - DICIEMBRE 2024
Estructura y organizacion de datos
Prof: Francisco Javier Montecillo puente
Programador: Evelyn Iris Hernandez Vigil
Descripcion: Estructura de una clase
Fecha: 03/09/2024
 */
package minicurso.jf;

public class Arreglos {

    private int[] arr = new int[10];

    public void file0to9() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void UnoVer1() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public void UnoVer2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i % 2 == 0) ? 0 : 1;
        }
    }

    public void from9to0() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }
    }

    public void shiftRigth() {
        int aux1 = arr[0];
        int aux2 = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {

            aux2 = arr[i + 1];
            arr[i + 1] = aux1;
            aux1 = aux2;
        }
        
        arr[0] = aux1;
    }

    @Override
    public String toString() {
        String str = " ";

        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        
        }
        return str;
    }
}
