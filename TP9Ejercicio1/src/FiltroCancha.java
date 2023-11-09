package com.mycompany.tp9ejercicio1;

import java.util.ArrayList;

public class FiltroCancha extends Filtro {
    private long idCanchaBuscada;

    public FiltroCancha(long idCanchaBuscada) {
        this.idCanchaBuscada = idCanchaBuscada;
    }
    
    @Override
    public boolean cumple(Socio socio) {
        boolean existe = false;
        int i = 0;
        
        while (existe && i < socio.getAlquileres().size()) {
            if (socio.getAlquileres().get(i).getIdCancha() == idCanchaBuscada) {
                existe = true;
            }
        }
        
        return existe;
    }
}