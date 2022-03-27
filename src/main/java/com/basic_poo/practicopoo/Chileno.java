package com.basic_poo.practicopoo;

/**
 * Clase < Chileno > hereda de < Persona >
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Chileno extends Persona {
    private int DNI;
    private String region;
    private String comuna;
    
    
    public Chileno(){
        
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    
}
