/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.productos;

/**
 *
 * @author todbolsa
 */
public class TareaEnvioCorreo implements TareaProducto {

    @Override
    public void ejecutar(Producto producto) {
        System.out.println(producto.getNombre() + "enviado por correo");
    }

}
