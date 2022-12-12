import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
public class Diccionario{
    public static HashMap<String, ArrayList<String>> diccionarios= new HashMap<String,ArrayList<String>>();
    private HashMap<String, ArrayList<String> > contenido;
    private String lenguaje;
    public static String Tiposdeanimales = "Animales";
    
    {
        contenido = new HashMap<String, ArrayList<String>>();
    }
    public Diccionario(){
        lenguaje = Tiposdeanimales;
        if(!diccionarios.containsKey(this.lenguaje)){
            diccionarios.put(this.lenguaje, new ArrayList<String>());
        }
      
        
    }
    public Diccionario(String lenguaje){
        this.lenguaje = lenguaje;
        if(!diccionarios.containsKey(this.lenguaje)){
            diccionarios.put(this.lenguaje,new ArrayList<String>() );
        }
        
    }
    public String getLenguaje(){return this.lenguaje;}
    public void addPalabra(String palabra, String significado){
        if(!this.contenido.containsKey(palabra)){
            this.contenido.put(palabra, new ArrayList<String>());
        }
        this.contenido.get(palabra).add(significado);
        diccionarios.get(this.lenguaje).add(palabra);
    }
    
    public String getSignificado(String palabra){
        return this.getSignificado(palabra, 0);
    }
    public HashMap<String, ArrayList<String> > getContenido(String lenguaje){
    	return contenido;
    }
    public String getSignificado(String palabra, int desambiguacion){
        if(!this.contenido.containsKey(palabra)){
            return "Este animal no esta clasificado no existe";
        }else{
            return this.contenido.get(palabra).get(desambiguacion);
        }
    }
}