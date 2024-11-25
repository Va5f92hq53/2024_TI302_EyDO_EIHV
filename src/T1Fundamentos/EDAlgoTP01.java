package T1Fundamentos;

public class EDAlgoTP01 {

    public static void problemaE1() {
        System.out.println("Problema 1");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void problemaE2() {
        System.out.println("Problema 2");
        //TRIANGULO A)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //TRIANGULO B)
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
        System.out.println();

        //TRIANGULO C)
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //TRIANGULO D)
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void problemaE3() {
        System.out.println("Imprimir graficos de barra");
        int[] arr = {5, 8, 12, 15, 20};
        
        //Acceder al arreglo, imprimir el numero
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " = ");
            
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void problemaE4() {
        System.out.println("Problema 4: Rombo");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            // 2 * 2 - 1 = 3; 
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        for (int i = 4; i >= 1; i--) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
    public static void problemaE5(){
        System.out.println("Problema 5");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class SalarioPorComision {

    private int[] ventas;
    private int[] histograma;
    private int[] salario;

    public enum Rango {
        R200_299, R300_399, R400_499, R500_599,
        R600_699, R700_799, R800_899, R900_900, R1000
    };

    public static final int NUMERO_DE_CASILLAS = 9;

    //7.10
    public SalarioPorComision(int[] ventas) {
        this.ventas = ventas;

        //CREAR ESPACIO A LOS DATOS
        this.salario = new int[ventas.length];
        this.histograma = new int[9];
    }

    public void calcularSalario() {
        for (int i = 0; i < ventas.length; i++) {
            salario[i] = (int) (200 + 0.09f * ventas[i]);
            switch(salario[i]){
                case 200:
                case 299: histograma[0]++; break;
            }
        }
    }

    public void imprimir() {
        System.out.print("Ventas");
        for (int i = 0; i < ventas.length; i++){
            System.out.println(ventas[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Salario: ");
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i] + " ");
        }
        System.out.println("");
    }
}
