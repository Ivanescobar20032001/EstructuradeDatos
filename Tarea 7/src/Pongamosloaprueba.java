public class Pongamosloaprueba {
   public static void main(String[] args) { 
    Cola<String> ColaPrueba = new Cola<>();
            
    // Is Empty
        System.out.println("\nEsta Vacia??");
        ColaPrueba.enqueue("Soy de relleno");
        System.out.println(ColaPrueba.isEmpty());
        System.out.println("False = La pila tiene almenos 1 elemento");        
    
    // Length
        System.out.println("\nCual es su tamanio");
        System.out.println("Tamanio : " + ColaPrueba.length());
        
    //enqueue
        ColaPrueba.enqueue("Relleno_1"); 
        ColaPrueba.enqueue("Relleno_2");  
        ColaPrueba.enqueue("Relleno_3");  
        ColaPrueba.enqueue("Relleno_4");  
        ColaPrueba.enqueue("Noquieroserelultimohelp");  
    
    // ToString
        System.out.println("\nCual es el estado actual de la cola?");
        System.out.println(ColaPrueba);
        System.out.println("Cual es su tamanio actual??");
        System.out.println("Tamanio : " + ColaPrueba.length());
        
    // dequeue
        System.out.println("\nCual es elemento que se encuentra al frente");
        System.out.println(ColaPrueba.dequeue());
   }
}
