/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.patroncomposite.model;

import com.unicauca.patroncomposite.controller.IComponenteViaje;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ledy Astudillo <lmastudillo@unicauca.edu.co>
 * @author Santiago Nieto <santiagonietu@unicauca.edu.co> * 
 * @version 1.0
 * 
 */
public class PaqueteCiudad implements IComponenteViaje{
    private String nombreCiudad;
    private String vueloLlegada;
    private String hotel;
   private List<IComponenteViaje> tours=new ArrayList();
    private String planAlimentacion;
    private String fechaCheckIn;
    private String fechaCheckOut;

    public PaqueteCiudad(String nombreCiudad, String vueloLlegada, String hotel, String planAlimentacion, String fechaCheckIn, String fechaCheckOut) {
        this.nombreCiudad = nombreCiudad;
        this.vueloLlegada = vueloLlegada;
        this.hotel = hotel;
        this.planAlimentacion = planAlimentacion;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
    }

   
    @Override
    public void agregar(IComponenteViaje tour) {
       this.tours.add(tour);
    }

    /**
     * @brief Imprime información sobre un paquete de ciudad, incluido el
     * nombre de la ciudad, vuelo de llegada, hotel, plan de comidas, fecha de entrada y fecha de
     * salida.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Paquete de Ciudad en " + nombreCiudad);
        System.out.println("Vuelo de llegada: " + vueloLlegada);
        System.out.println("Hotel: " + hotel);
        System.out.println("Plan de Alimentación: " + planAlimentacion);
        System.out.println("Fecha de Check-In: " + fechaCheckIn);
        System.out.println("Fecha de Check-Out: " + fechaCheckOut);
    }
}
