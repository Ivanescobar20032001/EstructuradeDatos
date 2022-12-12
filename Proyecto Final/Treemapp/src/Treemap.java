import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Treemap {

   public static void main(String args[]) {

    
      TreeMap<Integer, String> tmap = 
             new TreeMap<Integer, String>();

  
      tmap.put(1,"Jesus");
      tmap.put(5,"Jose");
      tmap.put(3,"Espiritu Santo");
      tmap.put(2,"Maria");
      tmap.put(11,"Los pastores");
      

     
      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("Posicion: "+ mentry.getKey() + " Palabra: ");
         System.out.println(mentry.getValue());
      }

   }
}