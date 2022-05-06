/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejercicios.Ejercicio3;

/**
 *
 * @author todbolsa
 */
public class AdaptadorImpresora extends Impresora {

    private final ImpresoraWord impresoraWord;

    public AdaptadorImpresora() {
        super();
        impresoraWord = new ImpresoraWord();
    }

    @Override
    public void imprimir() {
        impresoraWord.generarFichero(getTexto());
    }

}
