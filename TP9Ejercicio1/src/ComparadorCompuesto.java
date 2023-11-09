package com.mycompany.tp9ejercicio1;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> primerCriterio, segundoCriterio;

    public ComparadorCompuesto(Comparator<Socio> primerCriterio, Comparator<Socio> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }
    
    @Override
    public int compare(Socio s1, Socio s2) {
        int resultado = primerCriterio.compare(s1, s2);
        
        if (resultado != 0) {
            return resultado;
        }
        
        return segundoCriterio.compare(s1, s2);
    }
}