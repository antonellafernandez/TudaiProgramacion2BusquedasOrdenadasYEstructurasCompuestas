package com.mycompany.tp9ejercicio1;

import java.util.Comparator;

public class ComparadorCantidadAlquileresCancha implements Comparator<Socio> {
    private long idCanchaBuscada;

    public ComparadorCantidadAlquileresCancha(long idCanchaBuscada) {
        this.idCanchaBuscada = idCanchaBuscada;
    }

    @Override
    public int compare(Socio s1, Socio s2) {
        int contador1 = contarCancha(s1), contador2 = contarCancha(s2);
        
        if (contador1 < contador2) {
            return -1;
        } else if (contador1 > contador2) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private int contarCancha(Socio socio) {
        int contador = 0;
        
        for (Alquiler alquiler : socio.getAlquileres()) {
            if (alquiler.getIdCancha() == 13) {
                contador++;
            }
        }
        
        return contador;
    }
}