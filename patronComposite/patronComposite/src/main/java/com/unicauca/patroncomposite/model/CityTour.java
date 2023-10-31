/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.patroncomposite.model;

import com.unicauca.patroncomposite.controller.IComponenteViaje;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Santiago Nieto <santiagonietu@unicauca.edu.co>
 * @author Ledy Astudillo <lmastudillo@unicauca.edu.co>
 * @version 1.0
 * 
 */
public class CityTour implements IComponenteViaje{
    private double identificadorTour;
    private String nombre;
    private String descripcion;
    private String recomendaciones;
    private int duracionHoras;

    public CityTour(String nombre, String descripcion, String recomendaciones, int duracionHoras, double identificadorTour) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recomendaciones = recomendaciones;
        this.duracionHoras = duracionHoras;
        this.identificadorTour=identificadorTour;
    }

    @Override
    public void agregar(IComponenteViaje componente) {
        // Los tours no pueden tener componentes secundarios, por lo que este método está vacío.
    }

   /**
    * @brief Imprime el nombre, descripción, recomendaciones y duración de un
    * tour.
    */
    @Override
    public void mostrarInformacion() {
        System.out.println("Tour: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Recomendaciones: " + recomendaciones);
        System.out.println("Duración (horas): " + duracionHoras);
    }
}
