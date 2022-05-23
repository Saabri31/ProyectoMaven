/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio6;

/**
 *
 * @author todbolsa
 */
public class Cliente {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Wifi wifi = new Wifi();
        facade.ConectarAWifi(wifi.getWifi());
        facade.DesconectarDeWifi(wifi.getWifi());
        facade.ObtenerPosicion();

    }
}
