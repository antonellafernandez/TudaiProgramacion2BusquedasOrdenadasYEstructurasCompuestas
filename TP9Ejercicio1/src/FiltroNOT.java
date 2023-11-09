package com.mycompany.tp9ejercicio1;

public class FiltroNOT extends Filtro {
    private Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }
    
    @Override
    public boolean cumple(Socio socio) {
        return !f1.cumple(socio);
    }
}