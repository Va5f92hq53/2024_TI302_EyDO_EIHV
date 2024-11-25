/*
PRACTICA DE ARREGLOS
ITESS-TICS
AGOSTO  - DICIEMBRE
E y Od
Prof: Francisco Javier Montecillo Puente
Programador: Evelyn Iris Hernandez Vigil
Descripcion: Estructura de una clase
Fecha: 03/09/2024
*/
package minicurso.jf;

public class ArregloTest {
    public static void main(String[] args) {
        Arreglos arreglo = new Arreglos();
        //arreglo.UnoVer2();
        //arreglo.UnoVer1();
        //arreglo.file0to9();
        arreglo.from9to0();
        System.out.println(arreglo.toString());
        
        arreglo.shiftRigth();
        System.out.println(arreglo.toString());
        
    }
}
