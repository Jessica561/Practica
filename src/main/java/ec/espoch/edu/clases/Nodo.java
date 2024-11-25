
package ec.espoch.edu.clases;

//la "T" permite hacer una clase genererica
public class Nodo<T> {
    T dato;
    Nodo<T>siguiente;

    public Nodo(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    
    


    
}
