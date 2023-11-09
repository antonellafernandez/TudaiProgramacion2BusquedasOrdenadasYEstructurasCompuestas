package com.mycompany.tp9ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;

public class Socio {
    private String nombre, apellido;
    private int edad;
    private boolean ultimaCuota;
    private ArrayList<Alquiler> alquileres;

    public Socio() {
        this.alquileres = new ArrayList<>();
    }

    public Socio(String nombre, String apellido, int edad, boolean ultimaCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuota = ultimaCuota;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isUltimaCuota() {
        return ultimaCuota;
    }

    public void setUltimaCuota(boolean ultimaCuota) {
        this.ultimaCuota = ultimaCuota;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void addAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ultimaCuota=" + ultimaCuota + ", alquileres=" + alquileres + "}" + '\n';
    }
}