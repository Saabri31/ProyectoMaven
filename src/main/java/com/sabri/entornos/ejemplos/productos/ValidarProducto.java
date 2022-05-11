/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.productos;

/**
 *
 * @author todbolsa
 */
public class ValidarProducto implements TareaProducto {

    @Override
    public void ejecutar(Producto producto) {
        if (producto.getPrecio() < 100) {
            System.out.println("Producto valido");
        } else {
            System.out.println("Producto invalido");
        }
    }
}
