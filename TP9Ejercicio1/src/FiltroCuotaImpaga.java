package com.mycompany.tp9ejercicio1;

public class FiltroCuotaImpaga extends Filtro {
    @Override
    public boolean cumple(Socio socio) {
        return !socio.isUltimaCuota();
    }
}