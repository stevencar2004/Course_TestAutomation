package com.basic_poo.practicopoo;

/**
 * Clase < Perro > 
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Perro implements SerVivo{
    private String nombre;    
    private String raza;
    private String sexo;
    private double edad;

    public Perro() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    @Override
    public void cumpleaños(){
        this.edad++;
    }
    
    @Override
    public boolean esAdulto(){
        return this.edad > 1.5;
    }    
}
