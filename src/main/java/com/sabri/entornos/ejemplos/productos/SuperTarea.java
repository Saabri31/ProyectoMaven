/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.entornos.ejemplos.productos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author todbolsa
 */
public class SuperTarea implements TareaProducto {

    private final List<TareaProducto> lista;

    public SuperTarea() {
        this.lista = new ArrayList<>();
    }

    public void addTarea(TareaProducto tarea) {
        lista.add(tarea);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void ejecutar(Producto producto) {
        lista.forEach((t) -> t.ejecutar(producto));
    }
}
