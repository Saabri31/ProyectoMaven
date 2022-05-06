/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio3;

import com.sabri.entornos.ejemplos.impresoras.*;

/**
 *
 * @author todbolsa
 */
public class ImpresoraHTML extends Impresora {

    public ImpresoraHTML(String texto) {
        super(texto);
    }

    @Override
    public void imprimir() {
        System.out.println("Fichero HTML con " + getTexto());
    }

}
