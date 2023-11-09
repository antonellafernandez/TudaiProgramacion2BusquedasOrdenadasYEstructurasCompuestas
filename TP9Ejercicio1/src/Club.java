package com.mycompany.tp9ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        this.socios = new ArrayList<>();
    }
    
    public void addSocio(Socio socio) {
        this.socios.add(socio);
    }
    
    public ArrayList<Socio> buscar(Filtro filtro, Comparator<Socio> comparador) {
        ArrayList<Socio> cumplen = new ArrayList<>();
        
        for (int i = 0; i < this.socios.size(); i++) {
            if (filtro.cumple(this.socios.get(i))) {
                cumplen.add(this.socios.get(i));
            }
        }
        
        Collections.sort(cumplen, comparador);
        return cumplen;
    }
}