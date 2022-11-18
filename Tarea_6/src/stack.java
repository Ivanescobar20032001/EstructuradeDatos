public class stack<T> {
    private NodoPilas<T> peek;
    private int top;

    //Constructor
    public stack() {
        peek = null;
        this.top = 0;
    }

    //Esta vacia?¿
    public boolean isEmpty() {
        return peek == null;
    }
    
    //que tan larga es ^O^
    public int length() {
        return this.top;
    }
    
    //Saca ultimo elemento (el que esta arriba)
    public T pop() {
        if (isEmpty() == true) {
            return null;
        } 
        else 
        {
            T element = peek.getDato();
            peek = peek.getSiguiente();
            this.top--;
            return element;
        }
    }
    
    // Consultar el elemento de arriba
   public T peek() {
        return peek.getDato();
    }
   //Agrega elementos 
    public void push(T valor) {
        NodoPilas<T> aux = new NodoPilas<>(valor, peek);
        peek = aux;
        this.top++;
    }

    

   //Imprimir toda la pila
    @Override
    public String toString() {
        if (isEmpty()) {
            return "La pila esta vacia";
        } 
        else 
        {
            String Pila = "";
            NodoPilas<T> aux = peek;
            while (aux != null) {
                Pila += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }

            return Pila;
        }

    }
}
