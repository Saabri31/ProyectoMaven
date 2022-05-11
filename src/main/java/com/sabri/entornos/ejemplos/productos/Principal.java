/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.productos;

/**
 *
 * @author todbolsa
 */
public class Principal {

    public static void main(String[] args) {
        SuperTarea st = new SuperTarea();

        st.addTarea(new ValidarProducto());
        st.addTarea(new TareaEnvioCorreo());

        GestorTareas gt = new GestorTareas();
        Producto p = new Producto();
        p.setId(1);
        p.setNombre("Teclado");
        p.setPrecio(120);
        Producto p2 = new Producto();
        p2.setId(1);
        p2.setNombre("Ratón");
        p2.setPrecio(23.6);

        gt.ejecutar(st, p);
        gt.ejecutar(st, p2);
    }
}
