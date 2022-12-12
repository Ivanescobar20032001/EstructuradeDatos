import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PruebaLinkedHashMap {

    public static void main(String[] args) {
        Map<String, String> Traduccion = new LinkedHashMap<String, String>();
        Traduccion.put("Hello", " Holis");
        Traduccion.put("Today", " Hoy");
        Traduccion.put("Door", " Puerta");
        Traduccion.put("Goodbye "," Hasta lueguito");
        Traduccion.put("Bitch", " Playa =P");
        System.out.println("\nPalabras traducidas");
        for (String valor : Traduccion.values())
            System.out.print("|" + valor + "|");
        System.out.println();
        System.out.println("\nWords on englis");
        for (String clave : Traduccion.keySet())
            System.out.print("|" + clave + "|");
        System.out.println();
        System.out.println("\nLa traducción de Hello es:" + Traduccion.get("Hello"));
        System.out.println("La traducción de Today es:" + Traduccion.get("Today"));
        System.out.println("La traducción de Bitch es:" + Traduccion.get("Bitch"));
        System.out.println("La traducción de 'Six Flags' es:" + Traduccion.getOrDefault("Six Flags", "No me se la traduccion de Six Flags salu2"));
        Traduccion.remove("Bitch");
        System.out.println("\n"+Traduccion);
    }
}