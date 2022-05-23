/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.EjEvaluacion.almacenMVC.controlador;

import com.sabri.EjEvaluacion.almacenMVC.modelo.Producto;
import com.sabri.EjEvaluacion.almacenMVC.modelo.ProductoBBDD;
import com.sabri.EjEvaluacion.almacenMVC.modelo.TipoProducto;
import com.sabri.EjEvaluacion.almacenMVC.modelo.TipoProductoBBDD;
import java.util.ArrayList;

/**
 *
 * @author todbolsa
 */
public class Controlador {

    public static final int STOCK_SEGURIDAD = 10;

    public boolean comprobarStock() {
        return true;
    }

    public ArrayList<TipoProducto> devolverTipoProducto() {
        TipoProductoBBDD tp = new TipoProductoBBDD();
        return tp.cargarTipos();
    }

    public ArrayList<Producto> devolverProducto() {
        ProductoBBDD p = new ProductoBBDD();
        //return p.
        return null;
    }
}
