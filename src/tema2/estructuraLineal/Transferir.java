package tema2.estructuraLineal;

import java.util.Stack;

public class Transferir {

    public static <E> Stack<E> transfer(Stack<E> S) {
        Stack<E> T = new Stack<>();
        Stack<E> tempStack = new Stack<>();

        while (!S.isEmpty()) {
            tempStack.push(S.pop());
        }

        while (!tempStack.isEmpty()) {
            T.push(tempStack.pop());
        }
        return T;
    }

    //Metodo recursivo
    public static <E> void rStack(Stack<E> S) {
        if (!S.isEmpty()) {
            S.pop();         
            rStack(S);   
        }
    }

    public static void main(String[] args) {
        Stack<String> S = new Stack<>();
        S.push("A");
        S.push("B");
        S.push("C");

        Stack<String> T = Transferir.transfer(S);
        System.out.println("Pila T" + T);
        
        Transferir.rStack(S);
        System.out.println("Metodo recursivo " + S);
//        System.out.println(T);
    }
}
