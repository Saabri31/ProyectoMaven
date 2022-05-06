/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.impresoras;

/**
 *
 * @author todbolsa
 */
public class ImpresoraAdaptador extends Impresora {

    private final ImpresoraExcel impresoraExcel;

    public ImpresoraAdaptador() {
        super();
        impresoraExcel = new ImpresoraExcel();
    }

    @Override
    public void imprimir() {
        impresoraExcel.generarFichero(getTexto());
    }

}
