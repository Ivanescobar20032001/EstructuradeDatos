
public class cola_nodo<T> {
     //Atributos
    private T elemento;
    private cola_nodo<T> siguiente; //Apunta al siguiente nodo

    //Contructor
    public cola_nodo(T elemento, cola_nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    //Metodos
    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public cola_nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(cola_nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "["+elemento+"]";
    }
}
