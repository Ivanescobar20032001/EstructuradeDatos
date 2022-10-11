
package simplemente_ligadas;

/**
 *
 * @author ElTioWaffles
 */
public class Nodo <T>{
    // elementos del nodo
    private T dato; 
    Nodo <T> Siguiente;
   
    
    public Nodo(){
        
    }
    
    public Nodo(T valor){
        this.dato = valor;
        
    }
    
    //para poder agregar los datos en cada nodo 
    public Nodo (T dato, Nodo<T> siguiente){
        this.dato = dato;
        this.Siguiente = siguiente;
    }
     
    
     //seters y geters
     
     public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.Siguiente = siguiente;
    } 
    
    
   
    
     @Override
    public String toString() {
        return "|"+dato+"| -->";
        
    } 
}
