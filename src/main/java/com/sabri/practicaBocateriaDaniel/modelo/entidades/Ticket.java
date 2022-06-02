/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateriaDaniel.modelo.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author todbolsa
 */
public class Ticket {

    private int id;
    private LocalDateTime fechaHora;
    private String empleado;
    private double total;
    private HashMap<String,Integer> productos = new HashMap<String,Integer>();
   

    public Ticket(int id, LocalDateTime fechaHora, String empleado, double total, HashMap<String,Integer> productos) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.empleado = empleado;
        this.total = total;
    }

    public HashMap<String,Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String,Integer> productos) {
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", fechaHora=" + fechaHora + ", empleado=" + empleado + ", total=" + total + ", productos=" + productos + '}';
    }

   

}
