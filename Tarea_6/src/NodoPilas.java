
public class NodoPilas <T>{
    private T dato;
    private NodoPilas<T> siguiente;
    
    
   public NodoPilas(){
        
    } 
    
    public NodoPilas(T valor){
        this.dato = valor;
        
    }
    
    public NodoPilas (T dato, NodoPilas<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoPilas<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilas<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "["+dato+"]";
        
    }
    
}
