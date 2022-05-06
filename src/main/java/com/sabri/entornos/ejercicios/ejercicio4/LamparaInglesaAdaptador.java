/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.ejercicio4;

/**
 *
 * @author todbolsa
 */
public class LamparaInglesaAdaptador implements Connectable {

    private LamparaInglesa lamp;

    public LamparaInglesaAdaptador() {
        super();
        lamp = new LamparaInglesa();
    }

    @Override
    public void encender() {
        lamp.on();
    }

    @Override
    public void apagar() {
        lamp.off();
    }

    @Override
    public boolean isEncendida() {
        return lamp.isOn();
    }

}
