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
public class Continente implements IComponenteViaje  {
    private String nombre;
    private List<IComponenteViaje> paises = new ArrayList<>();

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void agregar(IComponenteViaje pais) {
        paises.add(pais);
    }

    /**
     * @brief Imprime el nombre del continente y luego llama a la función
     * "mostrarInformacion" para cada país del continente.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println("Continente " + nombre);
        for (IComponenteViaje pais : paises) {
            pais.mostrarInformacion();
        }
    }

    
}
