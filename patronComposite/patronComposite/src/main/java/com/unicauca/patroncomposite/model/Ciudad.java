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
public class Ciudad implements IComponenteViaje {
    private String nombre;
    private List<IComponenteViaje> paquetesCiudad = new ArrayList();

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregar(IComponenteViaje paquete) {
        paquetesCiudad.add(paquete);
    }

    /**
     * @brief Imprime el nombre de una ciudad y luego llama a la función
     * "mostrarInformacion" para cada paquete en la ciudad.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Ciudad: " + nombre);
        for (IComponenteViaje paquete : paquetesCiudad) {
            paquete.mostrarInformacion();
        }
    }
}
