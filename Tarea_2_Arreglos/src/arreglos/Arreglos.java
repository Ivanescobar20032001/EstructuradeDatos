
package arreglos;

import java.util.Scanner;


public class Arreglos {

    
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        int nalumnos;
        System.out.print("Numero de alumnos: ");
        nalumnos = teclado.nextInt();
        Integer[] alumnosedad = new Integer[nalumnos];
        Integer[] alumnoscuenta = new Integer[nalumnos];
        String[] alumnosname = new String[nalumnos];
        
         for (int i = 0; i < nalumnos; i++) {
             System.out.print("Edad del alumno numero " + (i+1) + ": ");
             alumnosedad[i] = teclado.nextInt();
             System.out.print("numero de cuenta del alumno numero " + (i+1) + ": ");
             alumnoscuenta[i] = teclado.nextInt();
             System.out.print("nombre del alumno numero " + (i+1) + ": ");
             alumnosname[i] = teclado.next();
             
        }
         
         
         for (int i = 0; i < nalumnos; i++) {
             System.out.print("la edad del alumno "+(i+1) +" es:  " );
             System.out.println(alumnosedad[i]+" ");
             System.out.print("el numero de cuenta del alumno "+(i+1) +" es:  " );
             System.out.println(alumnoscuenta[i]+" ");
             System.out.print("el nombre del alumno "+(i+1) +" es:  " );
             System.out.println(alumnosname[i]+" ");
             
        }
         
             
        }
        
    } 
    

