/*
ITESS-TICS
AGOSTO  - DICIEMBRE
E y Od
Prof: Francisco Javier Montecillo puente
Programador: Evelyn Iris Hernandez Vigil
Descripcion: Estructura de una clase
Fecha: 02/09/2024
 */
package minicurso.jf;

//import java.util.*;
public class UnaClase {
    //modificador de acceso
    private int numero;
    private float numero2;
    private double numero3;
    //constructor

    public UnaClase() {
    }
    

    public UnaClase(int numero, float numero2, double numero3) {
        this.numero = numero;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return "UnaClase{" + "numero=" + numero + ", numero2=" + numero2 + ", numero3=" + numero3 + '}';
    }
    

    public class OtraClase {
        

    }

}
