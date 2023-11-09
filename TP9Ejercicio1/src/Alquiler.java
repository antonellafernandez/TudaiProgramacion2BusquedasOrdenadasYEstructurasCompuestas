package com.mycompany.tp9ejercicio1;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private long idCancha;
    private double monto;

    public Alquiler() {
    }

    public Alquiler(LocalDate fecha, long idCancha, double monto) {
        this.fecha = fecha;
        this.idCancha = idCancha;
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public long getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(long idCancha) {
        this.idCancha = idCancha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "fecha=" + fecha + ", idCancha=" + idCancha + ", monto=" + monto + "}" + '\n';
    }
}