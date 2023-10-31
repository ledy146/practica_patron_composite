/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unicauca.patroncomposite.view;

import com.unicauca.patroncomposite.model.CityTour;
import com.unicauca.patroncomposite.model.Ciudad;
import com.unicauca.patroncomposite.model.Continente;
import com.unicauca.patroncomposite.controller.IComponenteViaje;
import com.unicauca.patroncomposite.model.Pais;
import com.unicauca.patroncomposite.model.PaqueteCiudad;

/**
 * @author Ledy Astudillo <lmastudillo@unicauca.edu.co>
 * @author Santiago Nieto <santiagonietu@unicauca.edu.co> * 
 * @version 1.0
 * 
 */
public class PatronComposite {

    public static void main(String[] args) {
        IComponenteViaje europa = new Continente("Europa");
        IComponenteViaje norteamerica = new Continente("Norteamérica");

        // Crear países
        IComponenteViaje espana = new Pais("España");
        IComponenteViaje usa = new Pais("Estados Unidos");

        // Agregar países a los continentes
        europa.agregar(espana);
        norteamerica.agregar(usa);

        // Crear ciudades
        IComponenteViaje madrid = new Ciudad("Madrid");
        IComponenteViaje newYork = new Ciudad("Nueva York");

        // Agregar ciudades a los países
        espana.agregar(madrid);
        usa.agregar(newYork);
        
         // Crear un paquete de ciudad para Madrid
        IComponenteViaje paqueteMadrid = new PaqueteCiudad("Madrid",
                "Vuelo de llegada a Madrid",
                "Hotel en Madrid",
               "Plan de Alimentación en Madrid",
                "Fecha de Check-In en Madrid",
                "Fecha de Check-Out en Madrid");
        IComponenteViaje paqueteNewYork = new PaqueteCiudad("Nueva York", 
                "Avianca 2456", "Halton 234", 
                "desayunos 8:00 \n almuerzo:12:00\n "
                        + "cena:8:00", "18/04/2034", "16/02/2035");
        // Agregar el paquete de ciudad a la ciudad
        madrid.agregar(paqueteMadrid);
        newYork.agregar(paqueteNewYork);
        

       
        // Crear tours
        IComponenteViaje tour1 = new CityTour("Tour histórico", "Visita lugares históricos", "No olvides la cámara", 3, 123);
        IComponenteViaje tour2 = new CityTour("Tour de naturaleza", "Explora la naturaleza", "Lleva repelente de insectos", 2,124);
        paqueteMadrid.agregar(tour1);
        paqueteNewYork.agregar(tour2);
       
        
        // Mostrar la información del viaje
        europa.mostrarInformacion();
        System.out.println("******************************");
        norteamerica.mostrarInformacion();
       
    }
}

