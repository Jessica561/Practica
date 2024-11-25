

package espoch.edu.ec.pila1;

import ec.espoch.edu.clases.Stack;

public class Pila1 {

    public static void main(String[] args) {
        Stack<Integer> pila=new Stack<>();
        pila.push(12);
        pila.push(145);
        pila.push(56);
        
        pila.mostrarElemento();
    }
}
