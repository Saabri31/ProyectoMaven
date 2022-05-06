/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.impresoras;

/**
 *
 * @author todbolsa
 */
public abstract class Impresora {

    private String texto;

    public Impresora() {
        this("");
    }
    
    public Impresora(String texto) {
        this.texto = texto;
    }
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract void imprimir();
}
