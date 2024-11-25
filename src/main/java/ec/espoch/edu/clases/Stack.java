
package ec.espoch.edu.clases;


public class Stack<T> {
    private Nodo<T> cima;//Representa la pila
    private int tamaño;//Tamaño de pila

    public Stack() {
        this.cima = cima;
        this.tamaño = tamaño;
    }
    public void push (T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.siguiente=cima;
        cima=nuevoNodo;
        tamaño++;//Incrementa el tamaño
    }
    public boolean isEmpty(){
        return cima==null;
    }
    public int tamaño(){
        return tamaño;
    }
    public T pop(){
        if (isEmpty()){
            throw new IllegalStateException("lapila");           
        }
        T dato=cima.dato;
        cima=cima.siguiente;
        tamaño--;
        return dato;
    }
    public T peek(){
        if (isEmpty()){
            throw new IllegalStateException("");
        }
        return cima.dato;
    }
    public void mostrarElemento(){
        Nodo actual=cima;
        //Verificar si la pila esta vacia
        if(actual==null){
            System.out.println("La pila esta vacia:");
            return;
        }
    
    }
    
}
