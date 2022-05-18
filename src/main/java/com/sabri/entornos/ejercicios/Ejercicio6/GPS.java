/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio6;

/**
 *
 * @author todbolsa
 */
public class GPS {

    public void Encender() {
        System.out.println("GPS encendido");
    }

    public void FijarPosicion() {
        System.out.println("Posicion fijada");
    }

    public void UltimaPosicion() {
        Posicion p = new Posicion();
        p.setLatitud("5.4");
        p.setLongitud("-0,5");
        p.setAltura("800");
        p.setFecha("2021--04-02 20:00");
        System.out.println(p.toString());
    }

    public void Apagar() {
        System.out.println("Apagar GPS");
    }
}
