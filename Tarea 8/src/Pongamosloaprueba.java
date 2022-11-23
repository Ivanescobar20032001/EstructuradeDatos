public class Pongamosloaprueba {
   public static void main(String[] args) { 
    Cola<String> Barco = new Cola<>();
    Cola<String> Sorry = new Cola<>();       
          
    
        
    //enqueue
        Barco.enqueue("1, Niñas");    
        Barco.enqueue("2, Niños"); 
        Barco.enqueue("2, 3ra edad");  
        Barco.enqueue("3, Mujeres"); 
        Barco.enqueue("3, Hombres"); 
        Barco.enqueue("4, Maestre");
        Barco.enqueue("4, Mecanico"); 
        Barco.enqueue("4, Vigia"); 
        Barco.enqueue("4, Timonel");  
        Barco.enqueue("5, Capitan");  
        
        Sorry.enqueue("Sorry"); 
        Sorry.enqueue("No"); 
        Sorry.enqueue("Pude"); 
        Sorry.enqueue("Hacer"); 
        Sorry.enqueue("El"); 
        Sorry.enqueue("Codigo"); 
        Sorry.enqueue("de"); 
        Sorry.enqueue("prioridad"); 
        Sorry.enqueue("Soybobo♥"); 
    
    // ToString
        System.out.println("\nCual es el estado actual de la cola?");
        System.out.println(Barco);
        System.out.println("Cual es su tamanio actual??");
        System.out.println("Tamanio : " + Barco.length());
        
    // dequeue
        System.out.println("Cual es elemento que se encuentra al frente");
        System.out.println(Barco.dequeue());
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println(Sorry);
   }
}