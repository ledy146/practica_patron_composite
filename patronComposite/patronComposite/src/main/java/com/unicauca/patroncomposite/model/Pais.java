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
public class Pais implements IComponenteViaje {
  private String nombre;
    private List<IComponenteViaje> ciudades = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregar(IComponenteViaje ciudad) {
        ciudades.add(ciudad);
    }

    /**
     * @brief Imprime el nombre de un país y luego llama a la función
     * "mostrarInformacion" para cada ciudad del país.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("País: " + nombre);
        for (IComponenteViaje ciudad : ciudades) {
            ciudad.mostrarInformacion();
        }
    }
}
