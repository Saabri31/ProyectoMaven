/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabri.entornos.ejercicios.Ejercicio7.resuelto.covid_mvc;

import com.sabri.entornos.ejercicios.Ejercicio7.resuelto.controller.Controller;
import com.sabri.entornos.ejercicios.Ejercicio7.resuelto.model.Sintomas;
import com.sabri.entornos.ejercicios.Ejercicio7.resuelto.view.View1;



/**
 *
 * @author rhtuf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sintomas modelo = new Sintomas();
        View1 vista = new View1();
        Controller controlador = new Controller(modelo, vista);
        controlador.iniciarVista();
    }
    
}
