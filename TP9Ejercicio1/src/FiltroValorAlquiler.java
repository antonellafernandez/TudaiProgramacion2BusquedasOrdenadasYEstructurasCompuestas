package com.mycompany.tp9ejercicio1;

public class FiltroValorAlquiler extends Filtro {
    private long monto;

    public FiltroValorAlquiler(long monto) {
        this.monto = monto;
    }
    
    @Override
    public boolean cumple(Socio socio) {
        boolean existe = false;
        int i = 0;
        
        while (existe && i < socio.getAlquileres().size()) {
            if (socio.getAlquileres().get(i).getMonto() > monto) {
                existe = true;
            }
        }
        
        return existe;
    }
}