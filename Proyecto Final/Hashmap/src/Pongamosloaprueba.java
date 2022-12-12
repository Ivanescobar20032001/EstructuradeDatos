import java.util.Map.Entry;
import java.util.ArrayList;

public class Pongamosloaprueba {
	public static void main(String[] args) {
		Diccionario animales = new Diccionario();
		
		animales.addPalabra("Caballo", "mamifero");
		animales.addPalabra("Delfin", "pez");
		animales.addPalabra("Perico", "aves");
		
		System.out.printf("especie de %s en %s: %s\n", "Caballo",animales.getLenguaje(), animales.getSignificado("Caballo"));
		System.out.printf("especie de %s en %s: %s\n", "Delfin",animales.getLenguaje(), animales.getSignificado("Delfin"));
		System.out.printf("especie de %s en %s: %s\n", "Perico",animales.getLenguaje(), animales.getSignificado("Perico"));
		// -----------
		System.out.printf("Se han creado %d diccionarios:\n",
				Diccionario.diccionarios.size());
		for (Entry<String, ArrayList<String>> diccionario : Diccionario.diccionarios.entrySet()) {
			System.out.printf("Diccionario de  %s tiene %d entradas\n",diccionario.getKey(), diccionario.getValue().size());
		
                        
			for(String palabra:diccionario.getValue()){
				System.out.println(palabra);
			}
		}
	}
}