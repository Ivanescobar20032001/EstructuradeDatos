
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Tarea1 {
     public static void main(String[] args) {
         int num;
         

         num = Integer.parseInt(JOptionPane.showInputDialog( "1 = mostrar archivo" + "\n" + 
                 "2 = Diferencia de seguidores (followers)en twitter" + "\n" +
                 "3 = Diferencia de visualizaciones de Youtube" + "\n" +
                 "4 = Crecimiento de Twitter y Facebook:" + "\n" +
                "Escribe el numero: "));
         
         if (num == 1) {
             String linea;
         try {
             BufferedReader lista = new BufferedReader (new FileReader("presenciaredes.csv"));
             linea = lista.readLine();
             while (linea != null){
                 System.out.println(linea);
                 linea = lista.readLine();
             }
         } catch (FileNotFoundException ex) {
             System.err.println(ex.getMessage());
         }  catch (IOException ex) {
             System.err.println(ex.getMessage());
         }  
             
         }
         
        if (num == 2) {
         
            System.out.println("Enero = 62,404 Junio = 67,496  Diferencia = 5,092 mas");
         
         } 
         
         if (num == 3) {
         
            System.out.println("Enero = 12,226 Junio = 17,344 Diferencia = 5,118 mas");
         
         } 
         
          if (num == 4) {
         
            System.out.println("FACEBOOK = promedio de crecimiento x mes: 4,495" + "\n" +
                    "TWITTER = promedio de crecimiento x mes: 59,841");
         
         } 
         
         
         
         
         
         
    }
}
