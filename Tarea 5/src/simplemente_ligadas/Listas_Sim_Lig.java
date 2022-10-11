
package simplemente_ligadas;

/**
 *
 * @author ElTioWaffles
 */
public class Listas_Sim_Lig <T> {
    
    Nodo <T> Head;
    int tamanio;
  
    public Listas_Sim_Lig (){
    
    Head = null;
} 
  
   public boolean vacia(){     // saber si una ranura esta vacia
         return Head == null;
    }
  
  public int get_tamanio(){   //saber el tamaño
      
  return this.tamanio;
  }
  
   public void agregar_final (T valor){ // agregar un valor al final
        
        if (this.Head == null) {
            Nodo <T> nuevoNodo = new Nodo<> (valor);
            Head = nuevoNodo;
            return;           
        }
        
        Nodo<T> aux = Head;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();            
        }
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        aux.setSiguiente(nuevoNodo);        
    }
  
  public void agregar_inicio (T valor){ // agregar un valor al inicio
        
       if (Head == null) {
          Head = new Nodo (valor);
      }
       else{
           Nodo <T> nuevoNodo = new Nodo<T>(valor, Head);
           nuevoNodo.setSiguiente(Head);
           Head = nuevoNodo;
                
       }  
      
    }
  
  public void agregar_despues (T referencia, T valor){ // agregar un valor en la siguiente posicion
        
        Nodo<T> aux = Head;
        while(aux.getDato() != referencia){
            aux = aux.getSiguiente();
        }
        Nodo<T> nuevo = new Nodo<>(valor, aux.getSiguiente());
        aux.setSiguiente(nuevo);
        
    }
  
  public void eliminar(int posicion){ // borra un valor en cualquer posicion
         if(posicion < 0 || (this.get_tamanio() <= posicion || vacia())) {
             
         }
          if(posicion == 0) {
            if(vacia()) return;
        Head = Head.getSiguiente();
            return;
        }

        int auxPosicion = 0;
        Nodo<T> NodoAnt = null;
        Nodo<T> aux = Head;

        while(aux.getSiguiente() != null && auxPosicion < posicion){
            NodoAnt = aux;
            aux = aux.getSiguiente();
            auxPosicion++;
        }
        NodoAnt.setSiguiente(aux.getSiguiente());
    }
  
  public void eliminar_primero() { // borra el primer valor
        if(vacia()) return;
        Head = Head.getSiguiente();
    }
  
  public void eliminar_final() { // borra el valor que este al final
        if(vacia()) return;
        if(get_tamanio() == 1) {
            eliminar_primero();
            return;
        }
        Nodo<T> nodoAnt = null;
        Nodo<T> aux = Head;
        while(aux.getSiguiente() != null){
            nodoAnt = aux;
            aux = aux.getSiguiente();
        }
        nodoAnt.setSiguiente(null);
    }
  
   public int buscar(T valor) { // busca la posicion de un valor en especial
        int posicion = 0;
        Nodo<T> aux = Head;
        while(aux != null){
            if(aux.getDato() == valor) {
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1;
    }
  
  public void actualizar(T a_buscar, T valor){ //remplaza un valor por otro
        if(buscar(a_buscar) < 0) return;

        Nodo<T> aux = Head;
        while(aux != null && aux.getDato() != a_buscar){
            aux = aux.getSiguiente();
        }
        if(aux.getDato() != a_buscar) return;
        aux.setDato(valor);
    }
  
   @Override
    public String toString() {  // el tu estring xD
        String ListaSimplemente_Ligada = "";
        Nodo<T> aux = Head;
        while(aux != null){
            ListaSimplemente_Ligada += aux;
            aux = aux.getSiguiente();
        }
        return ListaSimplemente_Ligada;
    }
  
}
