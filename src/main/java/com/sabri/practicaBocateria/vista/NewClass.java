/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.vista;

import com.sabri.practicaBocateria.modelo.entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author todbolsa
 */
public class NewClass {

    public static void main(String[] args) {
        ArrayList<Producto> prod = new ArrayList<>();
        Producto p1 = new Producto(1, "a", 25);
        Producto p2 = new Producto(2, "a", 25);
        Producto p3 = new Producto(3, "a", 25);
        Producto p4 = new Producto(4, "a", 25);
        Producto p5 = new Producto(5, "a", 25);
        prod.add(p1);
        prod.add(p2);
        prod.add(p3);
        prod.add(p4);
        prod.add(p5);
        System.out.println(prod.size());
    }
}
