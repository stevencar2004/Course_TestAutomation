package com.basic_poo.practicopoo;

/**
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Practicopoo {

    public static void main(String[] args) {
        Chileno AlexisSanchez = new Chileno();
        AlexisSanchez.setNombre("Alexis");
        AlexisSanchez.setApellido("Sanchez");
        AlexisSanchez.setEdad(34);
        AlexisSanchez.setComuna("Bajos del alto");
        AlexisSanchez.setRegion("Tocopilla");
        AlexisSanchez.setDNI(1020103354);
          
        Uruguayo LuisSuarez = new Uruguayo();
        LuisSuarez.setNombre("Luis");
        LuisSuarez.setApellido("Suarez");
        AlexisSanchez.setEdad(35);
        LuisSuarez.setBarrio("Salto");
        LuisSuarez.setDepartamento("MonteVideo");
        
        boolean result = soyUruguayoOChileno(LuisSuarez);
        System.out.println("Es una instancia de la clase Chileno o Uruguayo: " + result);
        
        Perro pitbull = new Perro();
        pitbull.setEdad(12);
        pitbull.setNombre("Zeus");
        pitbull.setRaza("Pitbull");
        
        Chileno otroChileno = new Chileno();
        otroChileno.setEdad(12);
        
        System.out.println("El Perro es adulto " + pitbull.esAdulto());
        System.out.println("El Chileno es adulto " + otroChileno.esAdulto());
    }
    
    
    public static boolean soyUruguayoOChileno(Persona persona){
        boolean result = (persona instanceof Uruguayo || persona instanceof Chileno) ;
        
        return result;
    }
}
