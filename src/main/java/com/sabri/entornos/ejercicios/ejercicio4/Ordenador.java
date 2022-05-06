/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.ejercicio4;

/**
 *
 * @author todbolsa
 */
public class Ordenador implements Connectable {

    private boolean encender;

    @Override
    public void encender() {
        this.encender = true;
    }

    @Override
    public void apagar() {
        this.encender = false;
    }

    @Override
    public boolean isEncendida() {
        return encender;
    }

}
