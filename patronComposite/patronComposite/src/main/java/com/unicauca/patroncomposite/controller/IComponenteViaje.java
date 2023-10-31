package com.unicauca.patroncomposite.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 * @author Santiago Nieto <santiagonietu@unicauca.edu.co>
 * @author Ledy Astudillo <lmastudillo@unicauca.edu.co>
 * @version 1.0
 * 
 */
public interface IComponenteViaje {
    /**
     * @brief Toma como parámetro un objeto de tipo "IComponenteViaje" y lo agrega a una
     * colección.
     * 
     * @param componente Es de tipo IComponenteViaje, que es una interfaz que
     * representa un componente de un viaje.
     */
    void agregar(IComponenteViaje componente);


    /**
     * @brief Se utiliza para mostrar información.
     */
    void mostrarInformacion();
}
