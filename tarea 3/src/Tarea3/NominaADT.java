/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

/**
 *
 * @author ElTioWaffles
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;

    public NominaADT(String ruta) {
        this.rutaArchivo=ruta;
        
    }
    
    public  static void main (String[] args){
        Empleado empleado1 = new Empleado (2345,"carlos", "perez", "castillo", 9850, 0, 2017);
        Empleado empleado2 = new Empleado (5754,"angel", "gomez", "garrido", 9850, 1, 2020);
        Empleado empleado3 = new Empleado (5345,"jesus", "martinez", "santos", 9850, 2, 2016);
        Empleado empleado4 = new Empleado (3267,"david", "jimenez", "lozano", 9850, 2, 2017);
        Empleado empleado5 = new Empleado (8765,"pedro", "ruiz", "guerrero", 9850, 0, 2017);
        Empleado empleado6 = new Empleado (5454,"DANIEL","HERNANDEZ","CANO",9850, 3, 2018);
        Empleado empleado7 = new Empleado (3456,"ALEJANDRO","DIAZ","PRIETO",9850,2,2018);
        Empleado empleado8 = new Empleado (3445,"MARIA","MORENO","MENDEZ",9850,1,2018);
        Empleado empleado9 = new Empleado (9088,"ALBERTO","MUNOZ","CRUZ",9850,1,2017);
        Empleado empleado10 = new Empleado (8877,"RAFAEL","ALVAREZ","FLORES",9850,2,2017);
        Empleado empleado11 = new Empleado (6767,"FERNANDO","ROMERO","HERRERA",9850,4,2019);
        Empleado empleado12 = new Empleado (5654,"PABLO","ALONSO","GALLEGO",9850,1,2019);
        Empleado empleado13 = new Empleado (4323,"JORGE","GUTIERREZ","MARQUEZ",9850,2,2020);
        Empleado empleado14 = new Empleado (2232,"RAMON","NAVARRO","LEON",9850,1,2016);
        Arreglo<Empleado> lista = new Arreglo(14);
        
        lista.setElemento(0, empleado1);
        System.out.println(lista.getElemento(0));
        lista.setElemento(1, empleado2);
        System.out.println(lista.getElemento(1));
        lista.setElemento(2, empleado3);
        System.out.println(lista.getElemento(2));
        lista.setElemento(3, empleado4);
        System.out.println(lista.getElemento(3));
        lista.setElemento(4, empleado5);
        System.out.println(lista.getElemento(4));
        lista.setElemento(5, empleado6);
        System.out.println(lista.getElemento(5));
        lista.setElemento(6, empleado7);
        System.out.println(lista.getElemento(6));
        lista.setElemento(7, empleado8);
        System.out.println(lista.getElemento(7));
        lista.setElemento(8, empleado9);
        System.out.println(lista.getElemento(8));
        lista.setElemento(9, empleado10);
        System.out.println(lista.getElemento(9));
        lista.setElemento(10, empleado11);
        System.out.println(lista.getElemento(10));
        lista.setElemento(11, empleado12);
        System.out.println(lista.getElemento(11));
        lista.setElemento(12, empleado13);
        System.out.println(lista.getElemento(12));
        lista.setElemento(13, empleado14);
        System.out.println(lista.getElemento(13));
        
        System.out.println("");
        System.out.println("");
        
        double hextra;
        hextra = empleado1.getSueldoBase()+empleado1.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado1.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado2.getSueldoBase()+empleado2.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado2.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado3.getSueldoBase()+empleado3.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado3.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado4.getSueldoBase()+empleado4.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado4.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado5.getSueldoBase()+empleado5.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado5.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado6.getSueldoBase()+empleado6.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado6.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado7.getSueldoBase()+empleado7.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado7.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado8.getSueldoBase()+empleado8.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado8.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado9.getSueldoBase()+empleado9.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado9.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado10.getSueldoBase()+empleado10.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado10.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado11.getSueldoBase()+empleado11.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado11.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado12.getSueldoBase()+empleado12.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado12.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado13.getSueldoBase()+empleado13.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado13.getNombre()+ " mas sus horas extras es de: "+hextra);
        hextra = empleado14.getSueldoBase()+empleado14.getHorasExtra()*276.5;
        System.out.println("El suedo de "+ empleado14.getNombre()+ " mas sus horas extras es de: "+hextra);
        
        
        
        System.out.println("");
        System.out.println("");
        int anio;
        anio = 2022;
        int mayor1; 
        mayor1= anio - empleado3.getAnioIngreso();
        int mayor2; 
        mayor2= anio - empleado14.getAnioIngreso();
        System.out.println("Los empleados con mayor antiguedad son; ");
        System.out.println(empleado3.getNombre()+ " "+ mayor1 +" anios");
        System.out.println(empleado14.getNombre()+ " "+ mayor2 +" anios");
        
        System.out.println("");
        System.out.println("");
        
        int menor1; 
        menor1= anio - empleado2.getAnioIngreso();
        int menor2; 
        menor2= anio - empleado13.getAnioIngreso();
        System.out.println("Los empleados con menor antiguedad son; ");
        System.out.println(empleado2.getNombre()+ " "+ menor1 +" anios");
        System.out.println(empleado13.getNombre()+ " "+ menor2 +" anios");
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
