package com.basic_poo.practicopoo;

/**
 * Clase base < Persona >
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Persona implements SerVivo {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public void cumpleaños(){
        this.edad++;
    }
    
    @Override
    public boolean esAdulto(){
        return getEdad() >= 18;
    }
}
