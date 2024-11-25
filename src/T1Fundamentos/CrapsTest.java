package T1Fundamentos;

/*
7 o 11 gana
2, 3, o 12 pierde el tiro
4, 5, 6, 7, 8, 9, 10 punto al jugador
gana si vale su punto antes que el 7
 */
public class CrapsTest {

    public static void main(String[] args) {
        int contador = 0;
        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        contador++;

        int suma = (dado1 + dado2);
        System.out.println("Dado 1: " + dado1 + " " + "Dado 2: " + dado2);
        System.out.println("Suma de los datos: " + suma);

        boolean gane = false;
        if (suma == 7 || suma == 11) {
            gane = true;
        }
        if (suma == 2 || suma == 3 || suma == 12) {
            gane = false;
        }
        int puntos = suma;

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            contador++;

            suma = dado1 + dado2;
            if (suma == puntos) {
                gane = true;
                break;
            } else if (suma == 7) {
                gane = false;
            }

        } while (true);
        if(suma == puntos) {
            System.out.println("Has ganado en " + contador + " intentos");
            gane = true;
        }
    }
}
