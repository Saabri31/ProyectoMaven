/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio7.mvc.controlador;

import com.sabri.entornos.ejercicios.Ejercicio7.mvc.modelo.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.mvc.vista.View1;

/**
 *
 * @author todbolsa
 */
public class Controlador {
    
    private final Sintomas modelo;
    private final View1 vista;

    public Controlador(Sintomas modelo, View1 vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    
    
}
