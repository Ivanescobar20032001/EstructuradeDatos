public class Cola <T>{
    private cola_nodo<T> primero;
    private cola_nodo<T> ultimo;
    private int tamanio;
    
    //Constructor
    public Cola() {
        primero = null;
        ultimo = null;
        tamanio = 0;
    }
    
    //Esta vacia?¿
    public boolean isEmpty() {
        return primero == null;
    }
    
    //que tan larga es ^O^
     public int length() {
        return tamanio;
    }
     
    //Ingresa un elemento al final
    public T enqueue(T elemento) {
    cola_nodo<T> aux = new cola_nodo(elemento, null);

    if (isEmpty()) {
            primero = aux;
            ultimo = aux;
        } 
    else {
            if (length() == 1) {
                primero.setSiguiente(aux);
            } 
            else {
                ultimo.setSiguiente(aux);
            }
            ultimo = aux;
        }

        tamanio++;
        return aux.getElemento();
    }
    
    //Saca el elemento que se encuentra el frente de la estructura.
    public T dequeue() {

        if (isEmpty()) {
            return null;
        }

        T elemento = primero.getElemento();
        cola_nodo<T> aux = primero.getSiguiente();
        primero = null;

        primero = aux;
        tamanio--;
        if (isEmpty()) {
            ultimo = null;
        }

        return elemento;
    }
    
    //Imprimir toda la cola
     public String toString() {

        if (isEmpty()) {
            return "La lista esta vacia";
        } else {

            String cadena = "";

            cola_nodo<T> aux = primero;
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }
            return cadena;
        }
    }
}
