import java.util.*;

public class Conjunto<T> { 

    private ArrayList<T> conjunto; 

    //constructor de conjuntos
    public String consConjunto() {
        String s = "";
        for (int i = 0; i < this.conjunto.size(); i++) {
            if (i == this.conjunto.size() - 1) {
                s += this.conjunto.get(i);
            } else {
                s += this.conjunto.get(i) + ",";
            }
        }
        return String.format("(%s)", s);
        
    }
    
    public Conjunto() {
        this.conjunto = new ArrayList<T>();
    } 

    public Conjunto(T... arr) { // varargs de tipo T (Double, String, Integer, etc...).
        this.conjunto = quitarRepetidos(arr);
    }

    public ArrayList getConjunto() {
        return this.conjunto;
    }

    //juntar conjuntos
    public Conjunto UnionCon(Conjunto otro) {
        for (T i : this.conjunto) {
            if (!otro.conjunto.contains(i)) {
                otro.conjunto.add(i);
            }
        }
        return otro;
    }
    //interseccion de conjuntos
    public Conjunto InterseccionCon(Conjunto otro) {
        Conjunto elements = new Conjunto();
        for (T i : this.conjunto) {
            if (otro.conjunto.contains(i)) {
                elements.conjunto.add(i);
            }
        }
        return elements;
    }
    //añadir conjuntos
    public void add(T x) {
        if (!this.conjunto.contains(x)) {
            this.conjunto.add(x);
        }
    }
   
    public String StringIt() {
        String s = "";
        for (T i : this.conjunto) {
            s += i;
        }
        return s;
    }
    public Conjunto calcularDiferencia(Conjunto otro) {
        Conjunto nuevo = new Conjunto();
        for (T i : this.conjunto) {
            if (!otro.conjunto.contains(i)) {
                nuevo.conjunto.add(i);
            }
        }
        if (nuevo.conjunto.isEmpty()) {
            return this;
        }
        return nuevo;
    }
    public boolean estaIncluidoEn(Conjunto otro) {
        return (otro.StringIt().contains(this.StringIt()));
    }
    public ArrayList quitarRepetidos(T... otro) {
        ArrayList<T> repetidos = new ArrayList<T>();
        for (T i : otro) {
            if (!repetidos.contains(i)) {
                repetidos.add(i);
            }
        }
        return repetidos;
    }
    //comparar elementos de los conjuntos
    public boolean igualA(Conjunto otro) {
        if (this.conjunto.size() != otro.conjunto.size()) { // si el tamaño varía, es porque definitivamente no son iguales.
            return false;
        }
        for (T i : this.conjunto) {
            if (!this.conjunto.contains(i)) {
                return false;
            }
        }
        return true;
    }
    //borrar elementos de los conjutnos
    public void Borra(T x) {
        if (this.conjunto.contains(x)) {
            this.conjunto.remove(x);
        }
    }

    
    
    
    
    //main
    public static void main(String... args) {
        Conjunto x;
        Conjunto y;
        Conjunto z;
        Conjunto w;
      
        
        
        int i = 0;
      
         x = new Conjunto(1, 2, 3);
         y = new Conjunto(3, 4, 5, 6, 2, 1);
         
          System.out.println("Imprimir conjunto 1: "+ x.consConjunto());
          System.out.println("Imprimir conjunto 2: "+ y.consConjunto());
          
          System.out.println("La union de los conjuntos 'x' y 'y' es: " + x.UnionCon(y).consConjunto() + "\n");
          System.out.println("La intersección de los conjuntos 'x' y 'y' es: " + y.InterseccionCon(x).consConjunto() + "\n");
        
         y.Borra(6);
         y.Borra(2);
         y.Borra(3);
         System.out.println();
         System.out.println("Quitar el 2, 3 y el 6 al conjunto 'y' unido con 'x' :" + "\n" + y.consConjunto());
        
         z = new Conjunto(5, 4, 3, 2, 1);
         w = new Conjunto(1, 2, 3, 4, 5);
         System.out.println();
         System.out.println("Imprimir conjunto W: "+ w.consConjunto());
          System.out.println("Imprimir conjunto Z: "+ z.consConjunto());
         System.out.println("El conjunto 'z' tiene los mismos elementos que el conjunto 'w'? "  + z.igualA(w));
         
         
         
         System.out.println();
         System.out.println("conjunto 1: "+ x.consConjunto());
         System.out.println("conjunto 2: "+ w.consConjunto());
         System.out.println("El conjunto 1 esta adentro del conjunto 2? " + x.estaIncluidoEn(w));
         System.out.println("El conjunto 2 esta adentro del conjunto 1? " + w.estaIncluidoEn(x));
         
         
         x = new Conjunto(1, 2, 3);
         y = new Conjunto(3, 2, 4, 5, 6);
        System.out.println();
         System.out.println("conjunto x: "+ x.consConjunto());
         System.out.println("conjunto y: "+ y.consConjunto());
        System.out.println("El conjunto 'x' menos el conjunto 'y' es: "  + x.calcularDiferencia(y).consConjunto());
        System.out.println("El conjunto 'y' menos el conjunto 'x' es: "  + y.calcularDiferencia(x).consConjunto() + "\n");
         
         
         
         
    }
}