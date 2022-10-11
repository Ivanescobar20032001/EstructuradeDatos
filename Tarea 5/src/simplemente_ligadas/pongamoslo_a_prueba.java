
package simplemente_ligadas;

/**
 *
 * @author ElTioWaffles
 */
public class pongamoslo_a_prueba {
    public static void main (String[] args){
          Listas_Sim_Lig<Integer> lista = new Listas_Sim_Lig<>();
        

        
        System.out.println("\n Esta vacia?");
        System.out.println(lista.vacia());

       
        
        //final
        System.out.println("\nAgregar al final 8 ");
        lista.agregar_final(8);
        System.out.println(lista);
        System.out.println("Agrega al final 9");
        lista.agregar_final(9);
        System.out.println(lista);
        

        //inicio
        System.out.println("\nAgrega 1 al inicio");
        lista.agregar_inicio(1);
        System.out.println(lista);
        System.out.println("Agrega 2 al inicio");
        lista.agregar_inicio(2);
        System.out.println(lista);
       
        
        //despues de
        System.out.println("\n Agregar despues de 2, un 3");
        lista.agregar_despues(2, 3);
        System.out.println(lista);
        
        //cualquier elemento
        System.out.println("\n Eliminar posicion 3");
        lista.eliminar(3);
        System.out.println(lista);
        
        //eliminar el primer elemento
        System.out.println("\n Eliminar primer elemento de la lista");
        lista.eliminar_primero();
        System.out.println(lista);
        
        //elimina el elemeto final
        System.out.println("\n Eliminar elemento final de la lista");
        lista.eliminar_final();
        System.out.println(lista);
        
        //buscar_valor
        System.out.println("\nBuscar 3 en la lista");
        System.out.println("El 3 se encuentra en la posicion: "+(lista.buscar(3)+1));
        
        //actualizar
        System.out.println("\nActualizar numero 3, por 5");
        lista.actualizar(3, 5);
        System.out.println(lista);
                
        
        
    }
}
