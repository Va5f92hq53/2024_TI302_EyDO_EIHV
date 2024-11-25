
package T1Fundamentos;

public class claseTest {
    public static void main(String[] args) {
        
        EDAlgoTP01 problema = new EDAlgoTP01();
        //problema.problemaE1();
        //problema.problemaE2();
        //problema.problemaE3();
        //problema.problemaE4();
        //problema.problemaE5();
        
        salarioPorCobrarTest();
    }
    
    public static void salarioPorCobrarTest(){
        int[] ventas = {5000, 430, 590};
        
        SalarioPorComision spc = new SalarioPorComision(ventas);
        spc.calcularSalario();
        spc.imprimir();
    }
}
