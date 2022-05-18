/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio6;

/**
 *
 * @author todbolsa
 */
public class Facade {

    private GPS gps = new GPS();
    private Wifi wifi = new Wifi();

    public void ConectarAWifi(String wifi) {
        this.wifi.Encender();
        this.wifi.Conectar(wifi);
    }

    public void DesconectarDeWifi(String wifi) {
        this.wifi.Desconectar();
        this.wifi.Apagar();
    }

    public void ObtenerPosicion() {
        this.gps.Encender();
        this.gps.FijarPosicion();
        this.gps.Apagar();
        this.gps.UltimaPosicion();
    }

}
