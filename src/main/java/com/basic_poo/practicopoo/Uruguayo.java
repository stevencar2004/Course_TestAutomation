package com.basic_poo.practicopoo;

/**
 * Clase < Uruguayo > hereda de < Persona >
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Uruguayo extends Persona {
    private Cedula CI;
    private String departamento;
    private String barrio;

    public Uruguayo() {
    }

    public int getCI() {
        return CI.getNumero();
    }

    public void setCI(int CI) {
        this.CI.setNumero(CI);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public void mudarse(String departamento, String barrio){
        setDepartamento(departamento);
        setBarrio(barrio);
    }
    
    public void imprimirInfo(){
        System.out.println("Nombre: " + this.getNombre() + " Apellido: " + this.getApellido() + " Genero: " + this.getGenero() + " CI: " + CI + " Departamento: " + departamento + " barrio: " + barrio);
    }
    
}
