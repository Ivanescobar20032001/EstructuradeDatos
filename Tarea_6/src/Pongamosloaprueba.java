public class Pongamosloaprueba {
     public static void main(String[] args) {

        stack<String> PilaPrueba = new stack<>();
       
        
        // Is Empty
        System.out.println("\nEsta Vacia??");
        PilaPrueba.push("Soy de relleno");
        System.out.println(PilaPrueba.isEmpty());
         System.out.println("False = La pila tiene almenos 1 elemento");
        // Length
        System.out.println("\nCual es su tamanio");
        System.out.println("Tamanio : " + PilaPrueba.length());

        // push
        PilaPrueba.push("Relleno_1");
        PilaPrueba.push("Relleno_2");
        PilaPrueba.push("Relleno_3");
        PilaPrueba.push("Relleno_4");
        PilaPrueba.push("Relleno_5");
        
        
        // ToString
        System.out.println("\nComo esta conformada la pila?");
        System.out.println(PilaPrueba);
        System.out.println("Cual es su tamanio actual??");
        System.out.println("Tamanio : " + PilaPrueba.length());
        
        // peek()
        System.out.println("\nCual es el elemento que esta arriba del todo");
        System.out.println(PilaPrueba.peek());
        
        // pop()
        System.out.println("\nSaca el ultimo elemento");
        System.out.println(PilaPrueba.pop());
        System.out.println("\nQue forma tiene la pila ahora?");
        System.out.println(PilaPrueba);

    }
}
