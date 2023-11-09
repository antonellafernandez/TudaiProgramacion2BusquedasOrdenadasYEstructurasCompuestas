package com.mycompany.tp9ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

/*

1. Fútbol 5

Un club de fútbol 5 necesita un sistema que le permita llevar control de sus socios y
alquileres de canchas. Cada socio posee un nombre y apellido, una edad, si tiene paga la
última cuota y una lista que contiene información de los alquileres de canchas que ha
realizado. Cuando un socio alquila una cancha, se registra la fecha, el ID de la cancha que
alquiló y cuánto pagó por el alquiler.

Cuando el dueño del club arriba al predio, le pide a los que administran el sistema, diferentes
listados, para comprobar cómo está funcionando el club:

a) Todos los socios con cuota impaga, ordenados alfabéticamente (primero por
apellido, y si hay varios con el mismo apellido por nombre).

b) Todos los socios menores de edad, ordenados por edad.

c) Todos los socios que alquilaron alguna vez la cancha N°13, ordenados cantidad
total de alquileres de esa cancha.

d) Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando
primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los
morosos, también ordenados alfabéticamente.

e) Cualquier combinación lógica de búsquedas.

*/

public class TP9Ejercicio1 {
    public static void main(String[] args) {
        Club c1 = new Club();
        
        Socio s1 = new Socio("Ramiro", "Antello", 17, false);
        s1.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 10, 500));
        s1.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1000));
        s1.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 16, 1500));
        c1.addSocio(s1);
        
        Socio s2 = new Socio("Tomás", "Antello", 15, false);
        s2.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 10, 500));
        s2.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1000));
        s2.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 13, 1500));
        c1.addSocio(s2);
        
        Socio s3 = new Socio("Manuel", "Ilarragorri", 18, false);
        s3.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 13, 600));
        s3.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1200));
        s3.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 13, 1800));
        c1.addSocio(s3);
        
        Socio s4 = new Socio("Jerónimo", "Ilarragorri", 18, true);
        s4.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 10, 600));
        s4.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1200));
        s4.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 13, 1800));
        c1.addSocio(s4);
        
        Socio s5 = new Socio("Candela", "Echazú", 19, true);
        s5.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 10, 600));
        s5.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1200));
        s5.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 13, 1800));
        c1.addSocio(s5);
        
        Socio s6 = new Socio("Mariano", "Vázquez", 19, true);
        s6.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 2), 10, 600));
        s6.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 4), 13, 1200));
        s6.addAlquiler(new Alquiler(LocalDate.of(2023, 10, 6), 13, 1800));
        c1.addSocio(s6);
        
        Filtro filtro = new FiltroCuotaImpaga();
        Comparator<Socio> comparador = new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre());
    
        ArrayList<Socio> resultado = c1.buscar(filtro, comparador);
    
        for (Socio socio : resultado) {
            System.out.println(socio);
        }
    }
}
