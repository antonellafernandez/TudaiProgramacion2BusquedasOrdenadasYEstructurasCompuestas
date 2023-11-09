package com.mycompany.tp9ejercicio1;

public class FiltroEdad extends Filtro {
    private int edad;

    public FiltroEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public boolean cumple(Socio socio) {
        if (socio.getEdad() < edad) {
            return true;
        }
        
        return false;
    }
}