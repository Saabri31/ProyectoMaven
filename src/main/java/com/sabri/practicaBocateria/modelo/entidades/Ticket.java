/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sabri.practicaBocateria.modelo.entidades;

import java.sql.Timestamp;

/**
 *
 * @author todbolsa
 */
public class Ticket {

    private int id;
    private Timestamp fechaHora;
    private String empleado;
    private double total;

    public Ticket(int id, Timestamp fechaHora, String empleado, double total) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.empleado = empleado;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
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
        return "Ticket{" + "id=" + id + ", fechaHora=" + fechaHora + ", empleado=" + empleado + ", total=" + total + '}';
    }

}
