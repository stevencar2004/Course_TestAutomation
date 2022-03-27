package com.basic_poo.practicopoo;

/**
 * Clase < Cedula >
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class Cedula {
    private int numero;
    private int digitoVerificador;

    public Cedula(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }
    
    
}
